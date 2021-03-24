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

    const val MATERIAL = "com.google.android.material:material:1.3.0"

    const val CONSTRAINT_LAYOUT ="androidx.constraintlayout:constraintlayout:2.0.4"


}