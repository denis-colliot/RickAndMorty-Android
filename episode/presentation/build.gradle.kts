import dev.rickandmorty.Dependency

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("de.mannodermaus.android-junit5")
    id("dagger.hilt.android.plugin")
}

dependencies {
    coreLibraryDesugaring(Dependency.Android.desugarJdkLibs)

    implementation(project(":core:design"))
    implementation(project(":episode:domain"))

    implementation(Dependency.AndroidX.coreKtx)
    implementation(Dependency.AndroidX.appCompat)
    implementation(Dependency.timber)
    implementation(Dependency.kotlinCoroutines)

    implementation(Dependency.AndroidX.activityCompose)
    implementation(Dependency.AndroidX.composeUi)
    implementation(Dependency.AndroidX.composeUiTooling)
    implementation(Dependency.AndroidX.composeFoundation)
    implementation(Dependency.AndroidX.composeMaterial)
    implementation(Dependency.AndroidX.composeMaterialIcons)
    implementation(Dependency.AndroidX.composeMaterialIconsExtended)
    implementation(Dependency.AndroidX.composeRuntimeLivedata)
    implementation(Dependency.AndroidX.composeRuntimeSaveable)
    implementation(Dependency.AndroidX.hiltNavigationCompose)

    implementation(Dependency.Google.hiltAndroid)
    kapt(Dependency.Google.hiltAndroidCompiler)

    testImplementation(Dependency.Test.junitJupiterApi)
    testRuntimeOnly(Dependency.Test.junitJupiterEngine)
    testImplementation(Dependency.Test.junitJupiterParams)
    testImplementation(Dependency.Test.assertJ)
    testImplementation(Dependency.Test.mockitoKotlin)
    testImplementation(Dependency.Test.mockitoInline)
}