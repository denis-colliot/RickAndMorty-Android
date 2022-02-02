import dev.rickandmorty.Dependency

plugins {
    id("com.android.application")
    id("kotlin-android")
    kotlin("kapt")
    id("de.mannodermaus.android-junit5")
    id("dagger.hilt.android.plugin")
}

android {
    defaultConfig {
        applicationId = "dev.rickandmorty"
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    lint {
        checkDependencies = true
    }
}

dependencies {
    coreLibraryDesugaring(Dependency.Android.desugarJdkLibs)

    implementation(Dependency.timber)
    implementation(Dependency.Google.hiltAndroid)
    kapt(Dependency.Google.hiltAndroidCompiler)
    implementation(Dependency.AndroidX.hiltNavigationCompose)
    implementation(Dependency.AndroidX.composeMaterial)
    implementation(Dependency.AndroidX.composeMaterialIcons)
    implementation(Dependency.AndroidX.composeMaterialIconsExtended)

    implementation(project(":core:design"))
    implementation(project(":core:navigation"))

    implementation(project(":episode:domain"))
    implementation(project(":episode:presentation"))
}