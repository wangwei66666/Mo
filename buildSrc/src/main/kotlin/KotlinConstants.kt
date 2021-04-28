//全局常量
object KotlinConstants {
    //Gradle 版本
    const val gradle_version = "4.1.2"

    //Kotlin 版本
    const val kotlin_version = "1.3.71"
}

//应用配置
object AppConfig {
    //依赖版本
    const val compileSdkVersion = 29

    //包名
    const val applicationId = "com.ww.mo"

    //最小支持SDK
    const val minSdkVersion = 21

    //当前基于SDK
    const val targetSdkVersion = 29

    //版本编码
    const val versionCode = 1

    //版本名称
    const val versionName = "1.0.0"
}

//依赖配置
object DependenciesConfig {
    //Kotlin基础库
    const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib:${KotlinConstants.kotlin_version}"

    //Kotlin核心库
    const val KTX_CORE = "androidx.core:core-ktx:1.3.2"

    //Android标准库
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.2.0"

    //实现Service的LifecycleOwner
    const val LIFECYCLE_SERVICE = "androidx.lifecycle:lifecycle-service:2.2.0"

    //ProcessLifecycleOwner给整个 app进程 提供一个lifecycle
    const val LIFECYCLE_PROCESS = "androidx.lifecycle:lifecycle-process:2.2.0"

    //material
    const val MATERIAL = "com.google.android.material:material:1.3.0"

    //约束布局
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.4"

    //EventBus
    const val EVENT_BUS = "org.greenrobot:eventbus:3.2.0"

    //lottie
    const val LOTTIE = "com.airbnb.android:lottie:3.7.0"

    //ARouter
    const val AROUTER = "com.alibaba:arouter-api:1.5.1"
    const val AROUTER_COMPILER = "com.alibaba:arouter-compiler:1.5.1"

}

//Module配置
object ModuleConfig {

    //是否App
    var isApp = false

    //包名
    const val MODULE_APP_MANAGER = "com.ww.mo.module_app_manager"
    const val MODULE_DEVELOPER = "com.ww.mo.module_developer"
    const val MODULE_SETTING = "com.ww.mo.module_setting"
}