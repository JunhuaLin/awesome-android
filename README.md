# Awesome Android
A curated list of awesome Android frameworks, libraries, software and resources

## Android性能优化

*关于Android性能优化相关的文章或者博客*

* [**Android 性能优化必知必会**](https://www.androidperformance.com/2018/05/07/Android-performance-optimization-skills-and-tools/) - 这篇文章记录了 Android 性能优化所必须掌握的知识,涵盖性能优化相关的方方面面。
* [**tailor**](https://github.com/bytedance/tailor) - Tailor是西瓜Android团队开发的一款通用内存快照裁剪压缩工具，通过它可以在异常时直接dump出一个迷你内存快照。快照中没 有任何敏感信息，更重要的是文件非常小的同时数据也相对完整，非常适合离线分析OOM及其他类型异常的调查定位。
* [**leakcanary**](https://github.com/square/leakcanary) - Android内存泄漏分析库，应该每个Android开发都用过吧~

## Flutter

*关于Flutter相关的文章或者博客*

* [**Flutter 跨平台演进及架构开篇**](http://gityuan.com/flutter/) - Flutter 跨平台演进及架构开篇，内容丰富有深度，拓展内容涉及到flutter事件分发，UI渲染等
* [**Flutter Boost**](https://github.com/alibaba/flutter_boost) - 咸鱼开源的原生与Flutter混合开发下页面路由管理库，包括原生与Flutter互相页面，单Flutter引擎，同步页面生命周期，支持Android与iOS等

## 音视频

*关于音视频相关的文章或者博客*

* [Android 音视频开发打怪升级](https://github.com/ChenLittlePing/LearningVideo) - 系列文章示例代码（A demo to introduce how to develop android video）。本项目将从MediaCodec硬解，FFmpeg软解，OpenGL等方面，全方位讲解如何在Android上进行音视频编辑开发。


## Android屏幕适配

* [Android屏幕适配全攻略](https://blog.csdn.net/zhaokaiqiang1992/article/details/45419023) - 从屏幕基础知识到常见适配方案的详细介绍。
* [一种极低成本的Android屏幕适配方式](https://mp.weixin.qq.com/s/d9QCoBP6kV9VSWvVldVVwA) - 通过修改dp和px的转换公式（px = dp * density）中density的值来达到屏幕适配的方法。
* [AndroidAutoSize](https://github.com/JessYanCoding/AndroidAutoSize) - 今日头条屏幕适配方案终极版，一个极低成本的 Android 屏幕适配方案的封装库。

## Database

*ORM数据库相关库*

* [LitePal](https://github.com/LitePalFramework/LitePal) - An Android library that makes developers use SQLite database extremely easy.
* [DBFlow](https://github.com/agrosner/DBFlow) - A blazing fast, powerful, and very simple ORM android database library that writes database code for you.
* [realm-java](https://github.com/realm/realm-java) - Realm is a mobile database: a replacement for SQLite & ORMs [http://realm.io](http://realm.io)
* [room](https://developer.android.google.cn/topic/libraries/architecture/room) - Room 持久性库在 SQLite 的基础上提供了一个抽象层，让用户能够在充分利用 SQLite 的强大功能的同时，获享更强健的数据库访问机制。

## HotFix

* [tinker](https://github.com/Tencent/tinker) - 腾讯的热修复解决方案，不装app的情况下更新 dex, library 和 resources。
* [AndFix](https://github.com/alibaba/AndFix) - 阿里的热修复解决方案。

## Plugin

*关于android插件化相关的框架或者文章*

* [VirtualAPK](https://github.com/didi/VirtualAPK) - A powerful and lightweight plugin framework for Android.Android 9.0 supported!
* [atlas](https://github.com/alibaba/atlas) - Atlas is an Android client-side containerization framework. we call it android dynamic component framework.Android 9.0 supported!
* [RePlugin](https://github.com/Qihoo360/RePlugin.git) - RePlugin是一套完整的、稳定的、适合全面使用的，占坑类插件化方案，由360手机卫士的RePlugin Team研发，也是业内首个提出”全面插件化“（全面特性、全面兼容、全面使用）的方案。


## Tools

*常用工具集合*

* [AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode) - 集合了Android很多非常常用的工具库。

* Android动态权限
    * [PermissionAgent](https://github.com/JunhuaLin/PermissionAgent) - 一处初始化处处可用的链式编程动态权限请求库。
    * [PermissionsDispatcher](https://github.com/permissions-dispatcher/PermissionsDispatcher) - 通过注解API处理运行时权限，简洁易用。
    * [AndPermission](https://github.com/yanzhenjie/AndPermission) - android动态权限申请的封装库，链式编程使用非常方便。

* file

    * [MMKV](https://github.com/Tencent/MMKV) - 基于 mmap 的高性能通用 key-value 组件，可完全替代SharedPreferences。
    * [SPManager](https://github.com/JunhuaLin/AndroidUtilsLibrary/blob/master/app/src/main/java/cn/junhua/android/utilslibrary/io/SPManager.java) - SharedPreferences工具类，通用数据存储
    * [CITool](https://github.com/JunhuaLin/AndroidUtilsLibrary/tree/master/app/ci) - 用于上传apk到ftp和AppStore

* network
    * [SSLUtils](https://github.com/JunhuaLin/AndroidUtilsLibrary/blob/master/app/src/main/java/cn/junhua/android/utilslibrary/ssl/SSLUtils.java) - 证书工具类，用于处理OKHttp证书设置的工具类
    * [SimpleCacheInterceptor](https://github.com/JunhuaLin/SimpleCacheInterceptor) - OKHttp3缓存拦截器用于缓存http请求结果。
    * [FileDownloader](https://github.com/lingochamp/FileDownloader) - Android 文件下载引擎，稳定、高效、灵活、简单易用。
    * [OkDownload](https://github.com/lingochamp/okdownload) - Android 文件下载引擎，稳定、高效、灵活、简单易用，是FileDownloader的升级版。

* apk相关工具
    * [DoraemonKit](https://github.com/didi/DoraemonKit) - 简称 "DoKit" 。一款功能齐全的客户端（ iOS 、Android ）研发助手，你值得拥有。
    * [jadx](https://github.com/skylot/jadx) - 一个优秀的apk反编译工具，有GUI界面和命令行操作非常方便。
    * [ClassyShark](https://github.com/google/android-classyshark) - Google开源，用于分析apk的工具，可以查看apk中类，接口，方法和dex的数量等信息。
    
* maven
   * [bintray-release](https://github.com/novoda/bintray-release) - A helper for releasing from gradle up to bintray。
    
* interpolator
   * [BezierInterpolator](https://github.com/JunhuaLin/AndroidUtilsLibrary/blob/master/app/src/main/java/cn/junhua/android/utilslibrary/interpolator/BezierInterpolator.java) - 基于贝塞尔曲线的动画插值器,可以实现任何常见插值器效果。
    
* 点9图
   * [NinePatchBuilder](https://github.com/JunhuaLin/AndroidUtilsLibrary/blob/master/app/src/main/java/cn/junhua/android/utilslibrary/ninepatch/NinePatchBuilder.java) - 动态构建bitmap图片的拉伸区域，生成NinePatchDrawable，即动态生成点9图。 


## Theme

* [MagicaSakura](https://github.com/Bilibili/MagicaSakura) - MagicaSakura 是 Android 多主题框架，支持日间/夜间模式。

## UI

*优秀的UI封装*

* QRCode
    * [android-zxingLibrary](https://github.com/yipianfengye/android-zxingLibrary) - 几行代码快速集成二维码扫描功能。

* Refresh Layout
    * [SmartRefreshLayout](https://github.com/scwang90/SmartRefreshLayout) - 下拉刷新、上拉加载、二级刷新、淘宝二楼、RefreshLayout、OverScroll，Android智能下拉刷新框架，支持越界回弹、越界拖动，具有极强的扩展性，集成了几十种炫酷的Header和 Footer。

* RecyclerView
    * [SwipeRecyclerView](https://github.com/yanzhenjie/SwipeRecyclerView) - RecyclerView侧滑菜单，Item拖拽，滑动删除Item，自动加载更多，HeaderView，FooterView，Item分组黏贴。
    * [MultiType](https://github.com/drakeet/MultiType) - RecyclerView多条目适配器，使用灵活，复用度高。
    * [MultiTypeAdapter](https://github.com/JunhuaLin/MultiTypeAdapter) - RecyclerView多条目适配器，灵活处理一对一，一对多条目，更小的复用粒度。

* Status&Navigation Bar
    * [ImmersionBar](https://github.com/gyf-dev/ImmersionBar) - android 4.4以上沉浸式状态栏和沉浸式导航栏管理，包括状态栏字体颜色，适用于Activity、Fragment、DialogFragment、Dialog，并且适配刘海屏，适配软键盘弹出等问题，一句代码轻松实现，以及对bar的其他设置。

* UI库快速开发
    * [QMUI_Android](https://github.com/Tencent/QMUI_Android) - 提高 Android UI 开发效率的 UI 库，常见View封装即开即用，常用工具沉浸式状态工具等 http://qmuiteam.com/android
    
    * [ELinkageScroll](https://github.com/MFC-TEC/ELinkageScroll) - 多子view嵌套滚动通用解决方案(入侵性较大，建议使用ConsecutiveScrollerLayout)
    
    * [Fragmentation](https://github.com/YoKeyword/Fragmentation) - A powerful library that manage Fragment for Android
    
    * [ConsecutiveScrollerLayout](https://github.com/donkingliang/ConsecutiveScroller) - ConsecutiveScrollerLayout是Android下支持多个滑动布局(RecyclerView、WebView、ScrollView等)和lView等)和普通控件(TextView、ImageView、LinearLayou、自定义View等)持续连贯滑动的容器,它使所有的子View像一个整体一样连续顺畅滑动。并且支持布局吸顶功能。

## WebView

* [VasSonic](https://github.com/Tencent/VasSonic) - 腾讯出品专注于H5首屏加速。
* [美团WebView性能、体验分析与优化](https://tech.meituan.com/2017/06/09/webviewperf.html)
* [腾讯x5内核](https://x5.tencent.com/)
* [WebView与JS交互](https://blog.csdn.net/carson_ho/article/details/64904691) - 全面地介绍Android通过WebView与JS交互方式。
* [今日头条品质优化 - 图文详情页秒开实践](https://mp.weixin.qq.com/s/Xqr6rQBbx7XPoBESEFuXJw) - 非常不错的秒开方案，基于前后端分离的h5页面，并将页面模板部分（css,js,html）本地化,在展示时候并行请求数据并填充展示，在此基础上再增加模板预热，webview复用等。
* [70%以上业务由H5开发，手机QQ Hybrid 的架构如何优化演进？](https://mp.weixin.qq.com/s/evzDnTsHrAr2b9jcevwBzA?) - 手机QQ Hybrid 的架构如何优化演进

## 调试

*关于Android调试的文章或者博客，以及工具*

* [Android Studio你不知道的调试技巧](http://weishu.me/2015/12/21/android-studio-debug-tips-you-may-not-know/) - 介绍常用的断点技巧，如条件断点,日志断点,异常断点和Field WatchPoint等。
* [如何调试Android Framework？](http://weishu.me/2016/05/30/how-to-debug-android-framework/) - Debug是一项非常非常重要的技能，毋庸多言，掌握这项技能，那么Java层的任何问题都拦不住你了。
* [Android性能调优利器StrictMode](https://droidyue.com/blog/2015/09/26/android-tuning-tool-strictmode/) - StrictMode意思为严格模式，是用来检测程序中违例情况的开发者工具，是Android自带的工具类。
* [Android Systrace 基础知识 -- Systrace](https://www.androidperformance.com/2019/05/28/Android-Systrace-About/):Systrace系列知识全面且深度，包括android SurfaceFlinger解读，Choreographer的渲染机制详解，Vsync 解读等深度好文。

## 架构相关

*关于架构相关的技术文章*

## Maven操作

*关于如何在Maven和Jcent发布自己的库*

* [私有库发布到jCenter和Maven](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0623/3097.html)
* [bintray-release](https://github.com/novoda/bintray-release) - A helper for releasing from gradle up to bintray

## 大厂github

* [Square](https://github.com/square)
* [阿里巴巴](https://github.com/alibaba)
* [腾讯](https://github.com/Tencent)
* [滴滴出行](https://github.com/didi) 
* [Airbnb](https://github.com/airbnb)


## 优秀的博客

### 大厂技术博客

* [JAKE WHARTON](https://jakewharton.com/)
* [美团技术团队](https://tech.meituan.com/)
* [Android 开发技术周报](https://androidweekly.cn/)
* [网易考拉移动端团队](https://blog.klmobile.app/)
* [有赞技术团队](https://tech.youzan.com/tag/mobile/)
* [字节跳动技术团队](https://juejin.im/user/5b3d7c31f265da0fa12202af)


### 个人技术博客

* [wingjay](http://wingjay.com/) - android干货，代表作有<<亿级Android架构>>
* [匠心写作](http://gank.io/post/published) - 文章虽少但都是精品，代表作《RxJava 与 Retrofit 结合的最佳实践 (tough1985)》
* [Carson_Ho](https://www.jianshu.com/u/383970bef0a0) - 简书认证作者、CSDN签约作者、稀土掘金专栏作者。分享 Android开发 干货
* [Android Performance](https://www.androidperformance.com/):Gracker的android技术博客，质量非常高值得学习，代表作《Android 性能优化必知必会》



# awesome集中营

* [awesome-python](https://github.com/vinta/awesome-python) - python的资源列表。
* [Java后端架构师技术图谱 architect-awesome](https://github.com/xingshaocheng/architect-awesome) - Java后端架构师技术图谱，包括算法，数据结构，设计模式，网络，数据库和中间件等。
* [awesome-android](https://github.com/JStumpp/awesome-android) - JStumpp的Android资源列表。
* [awesome-flutter](https://github.com/Solido/awesome-flutter) - An awesome list that curates the best Flutter libraries, tools, tutorials, articles and more.

# android面试题
   * [Android-Interview](https://github.com/android-exchange/Android-Interview) - 收集 Android 开发相关最具价值的面试题及常见套路，包括技术知识点，算法，架构，行业发展方向，hr问答等，持续更新.
   * [Android高级工程师面试题](https://www.jianshu.com/p/e6702d61eec9) - 这些题目是网友去百度、小米、乐视、美团、58、猎豹、360、新浪、搜狐等一线互联网公司面试被问到的题目。熟悉本文中列出的知识点会大大增加通过前两轮技术面试的几率。
   * [Android-Notes](https://github.com/Omooo/Android-Notes) - 最全最完善的 Android 文章集，赌一包小鱼干不看绝对后悔。
   * [android-interview-questions](https://github.com/MindorksOpenSource/android-interview-questions) - Android Interview Questions - Your Cheat Sheet For Android Interview
   
   
# 其他优秀的导航网站

* [玩android](https://www.wanandroid.com/navi)
