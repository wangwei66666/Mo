plugins {
    id ("com.android.library")
    id ("kotlin-android")
}

android {
    compileSdkVersion(AppConfig.compileSdkVersion)

    defaultConfig {
        minSdkVersion (AppConfig.minSdkVersion)
        targetSdkVersion (AppConfig.targetSdkVersion)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//        consumerProguardFiles "consumer-rules.pro"
    }

    buildTypes {
//        getByName("debug") {
//
//        }
//        getByName("release") {
//            isMinifyEnabled = false
//        }
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
    implementation(DependenciesConfig.STD_LIB)
    implementation(DependenciesConfig.KTX_CORE)
    implementation(DependenciesConfig.APP_COMPAT)
    implementation(DependenciesConfig.MATERIAL)
}