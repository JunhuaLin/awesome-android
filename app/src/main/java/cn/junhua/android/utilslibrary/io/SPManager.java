package cn.junhua.android.utilslibrary.io;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * SharedPreferences工具类，通用数据存储
 *
 * @author junhua.lin@jinfuzi.com<br/>
 * CREATED 2019/3/2 15:18
 */
public class SPManager {
    @SuppressLint("StaticFieldLeak")
    private static Context CONTEXT;
    private String name;
    private SoftReference<SharedPreferences> softSP = new SoftReference<>(null);
    private List<Interceptor> mInterceptorList = new ArrayList<>();

    private SPManager() {
        this.name = "sp_manager";
    }

    private SPManager(String name) {
        this.name = name;
    }

    public static SPManager getInstance() {
        return InstanceHolder.INSTANCE;
    }

    /**
     * 只需要初始化一次即可
     *
     * @param context Context
     */
    public static void init(Context context) {
        CONTEXT = context.getApplicationContext();
    }

    /**
     * 此处用来处理非通用情况下的存储情况
     *
     * @param name 文件名
     * @return SPManager
     */
    public static SPManager newInstance(String name) {
        return new SPManager(name);
    }

    public void addInterceptor(Interceptor interceptor) {
        this.mInterceptorList.add(interceptor);
    }

    private SharedPreferences getSP() {
        if (CONTEXT == null) {
            throw new IllegalStateException("初始化SPManager啊，大兄弟！");
        }

        SharedPreferences sp = softSP.get();
        if (sp == null) {
            sp = CONTEXT.getSharedPreferences(String.format(CONTEXT.getPackageName() + ".%s.sp", name), Context.MODE_MULTI_PROCESS);
            softSP = new SoftReference<>(sp);
        }
        return sp;
    }

    public void put(@NonNull String key, @Nullable String vale) {
        for (Interceptor interceptor : mInterceptorList) {
            vale = interceptor.doPut(vale);
        }

        SharedPreferences.Editor editor = getSP().edit();
        editor.putString(key, vale);
        editor.apply();
    }

    public void put(@NonNull String key, boolean vale) {
        put(key, String.valueOf(vale));
    }

    public void put(@NonNull String key, float vale) {
        put(key, String.valueOf(vale));
    }

    public void put(@NonNull String key, int vale) {
        put(key, String.valueOf(vale));
    }

    public void put(@NonNull String key, long vale) {
        put(key, String.valueOf(vale));
    }

    public <T> T get(@NonNull String key, T defaultValue) {
        String className = defaultValue.getClass().getName();
        SharedPreferences sp = getSP();
        String value = sp.getString(key, null);

        for (Interceptor interceptor : mInterceptorList) {
            value = interceptor.doGet(value);
        }

        if (value == null) {
            return defaultValue;
        }

        try {
            Object temp;
            if (className.equals(String.class.getName())) {
                return (T) value;
            }

            if (className.equals(Integer.class.getName())
                    || className.equals(int.class.getName())) {
                temp = Integer.parseInt(value);
                return (T) temp;
            }

            if (className.equals(long.class.getName())
                    || className.equals(Long.class.getName())) {
                temp = Long.parseLong(value);
                return (T) temp;
            }

            if (className.equals(float.class.getName())
                    || className.equals(Float.class.getName())) {
                temp = Float.parseFloat(value);
                return (T) temp;
            }

            if (className.equals(boolean.class.getName())
                    || className.equals(Boolean.class.getName())) {
                if (value.equalsIgnoreCase("false")
                        || value.equalsIgnoreCase("true")) {
                    temp = Boolean.parseBoolean(value);
                    return (T) temp;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            String msg = String.format("SPManger.get(%s,%s) = \"%s\" cannot be cast to %s", key, defaultValue, value, className);
            throw new IllegalArgumentException(msg);
        }

        return defaultValue;
    }

    public boolean contains(@NonNull String key) {
        return getSP().contains(key);
    }

    public void remove(@NonNull String key) {
        getSP().edit().remove(key).apply();
    }

    public void removeAll() {
        getSP().edit().clear().apply();
    }

    public Map<String, ?> getAll() {
        return getSP().getAll();
    }

    /**
     * 存取过程中对value进项响应操作
     */
    public interface Interceptor {
        String doPut(String value);

        String doGet(String value);
    }

    private static final class InstanceHolder {
        @SuppressLint("StaticFieldLeak")
        private final static SPManager INSTANCE = new SPManager();
    }
}
