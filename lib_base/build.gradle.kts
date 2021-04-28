plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(AppConfig.compileSdkVersion)

    defaultConfig {
        minSdkVersion(AppConfig.minSdkVersion)
        targetSdkVersion(AppConfig.targetSdkVersion)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("debug") {

        }
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    //依赖操作
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    api(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    //Kotlin标准库
    api(DependenciesConfig.STD_LIB)
    //Kotlin核心库
    api(DependenciesConfig.KTX_CORE)
    //Android标准库
    api(DependenciesConfig.APP_COMPAT)
    //实现Service的LifecycleOwner
    api(DependenciesConfig.LIFECYCLE_SERVICE)
    //ProcessLifecycleOwner给整个 app进程 提供一个lifecycle
    api(DependenciesConfig.LIFECYCLE_PROCESS)
    //MATERIAL
    api(DependenciesConfig.MATERIAL)
    //约束布局
    api(DependenciesConfig.CONSTRAINT_LAYOUT)
    //EventBus
    api(DependenciesConfig.EVENT_BUS)
    //ARouter
    api(DependenciesConfig.AROUTER)
    //LOTTIE
    api(DependenciesConfig.LOTTIE)

    api(project(":lib_network"))
}