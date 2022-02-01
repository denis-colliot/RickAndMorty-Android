import dev.rickandmorty.Dependency

plugins {
    id("com.android.library")
    id("kotlin-android")
    kotlin("kapt")
}

dependencies {
    implementation(Dependency.timber)
    implementation(Dependency.Google.hiltAndroid)
    kapt(Dependency.Google.hiltAndroidCompiler)
    implementation(Dependency.AndroidX.navigationCompose)
    implementation(Dependency.AndroidX.hiltNavigationCompose)
}