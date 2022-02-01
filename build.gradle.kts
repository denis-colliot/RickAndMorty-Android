// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(dev.rickandmorty.Dependency.Plugin.androidGradle)
        classpath(dev.rickandmorty.Dependency.Plugin.kotlinGradle)
        classpath(dev.rickandmorty.Dependency.Plugin.androidJunit5)
        classpath(dev.rickandmorty.Dependency.Plugin.hiltGradle)
    }
}

tasks {
    register<Delete>("clean") {
        delete(rootProject.buildDir)
    }
}

subprojects {
    afterEvaluate {
        configureKotlinGradleModule()
        extensions.findByType<com.android.build.gradle.BaseExtension>()?.apply {
            configureAndroidGradleModule()
            configureAndroidJetpackCompose()
        }
        extensions.findByType<org.jetbrains.kotlin.gradle.plugin.KaptExtension>()?.apply {
            configureKapt()
        }
    }
}

/**
 * Configure kotlin gradle module (whether it is an android module or not).
 */
fun Project.configureKotlinGradleModule() {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = dev.rickandmorty.Dependency.javaVersion.toString()
        }
    }
    tasks.withType<JavaCompile> {
        sourceCompatibility = dev.rickandmorty.Dependency.javaVersion.toString()
        targetCompatibility = dev.rickandmorty.Dependency.javaVersion.toString()
    }
}

/**
 * Configure android gradle module.
 */
fun com.android.build.gradle.BaseExtension.configureAndroidGradleModule() {
    setCompileSdkVersion(dev.rickandmorty.AndroidConfiguration.compileSdk)
    defaultConfig {
        minSdk = dev.rickandmorty.AndroidConfiguration.minSdk
        targetSdk = dev.rickandmorty.AndroidConfiguration.compileSdk
    }
    compileOptions {
        sourceCompatibility = dev.rickandmorty.Dependency.javaVersion
        targetCompatibility = dev.rickandmorty.Dependency.javaVersion
        isCoreLibraryDesugaringEnabled = true // Flag to enable support for the new language APIs
    }
}

/**
 * Configure gradle module using KAPT (ex: Google Dagger Hilt).
 */
fun org.jetbrains.kotlin.gradle.plugin.KaptExtension.configureKapt() {
    // https://developer.android.com/training/dependency-injection/hilt-android#setup
    correctErrorTypes = true
}

/**
 * Configure gradle module using Android Jetpack Compose.
 */
fun com.android.build.gradle.BaseExtension.configureAndroidJetpackCompose() {
    buildFeatures.compose = true
    composeOptions {
        kotlinCompilerExtensionVersion = dev.rickandmorty.Dependency.AndroidX.composeCompilerVersion
    }
}