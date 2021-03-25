//引用插件
plugins {
    id("com.android.application")
    id("kotlin-android")
}
//Android属性
android {
    compileSdkVersion(AppConfig.compileSdkVersion)
    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdkVersion (AppConfig.minSdkVersion)
        targetSdkVersion (AppConfig.targetSdkVersion)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    //签名配置
    signingConfigs {
        register("release") {
            //别名
            keyAlias = "mo"
            //别名密码
            keyPassword = "mo20191110"
            //路径
            storeFile = file("/src/main/jks/mo.jks")
            //密码
            storePassword = "mo20191110"
        }
    }
    //编译类型
    buildTypes {
        getByName("debug") {

        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    //输出类型
    android.applicationVariants.all {
        //编译类型
        val buildType = this.buildType.name
        outputs.all {
            //输出APK
            if (this is com.android.build.gradle.internal.api.ApkVariantOutputImpl) {
                if (buildType == "release") {
                    this.outputFileName = "Mo_V${defaultConfig.versionName}_$buildType.apk"
                }
            }
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
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(DependenciesConfig.STD_LIB)
    implementation(DependenciesConfig.KTX_CORE)
    implementation(DependenciesConfig.APP_COMPAT)
    implementation(DependenciesConfig.MATERIAL)
    implementation(DependenciesConfig.CONSTRAINT_LAYOUT)
}