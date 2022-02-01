package dev.rickandmorty

import org.gradle.api.JavaVersion

/**
 * Project dependencies & corresponding versions.
 */
object Dependency {

    val javaVersion = JavaVersion.VERSION_11
    const val kotlinVersion = "1.6.10"
    private const val kotlinCoroutinesVersion = "1.6.0"

    object Plugin {
        const val androidGradle = "com.android.tools.build:gradle:7.1.0"
        const val androidJunit5 = "de.mannodermaus.gradle.plugins:android-junit5:1.8.2.0"
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:${Google.hiltVersion}"
    }

    object Android {
        const val desugarJdkLibs = "com.android.tools:desugar_jdk_libs:1.1.5"
    }

    object AndroidX {
        private const val composeVersion = "1.1.0-rc01"
        const val composeCompilerVersion = "1.1.0-rc02" // Compatible with kotlin 1.6.10

        const val coreKtx = "androidx.core:core-ktx:1.7.0"
        const val appCompat = "androidx.appcompat:appcompat:1.4.1"

        const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        const val navigationCompose = "androidx.navigation:navigation-compose:2.4.0"

        const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"

        const val composeUi = "androidx.compose.ui:ui:$composeVersion"

        // Tooling support (Previews, etc.)
        const val composeUiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"

        // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
        const val composeFoundation = "androidx.compose.foundation:foundation:$composeVersion"

        // Material Design
        const val composeMaterial = "androidx.compose.material:material:$composeVersion"

        // Material design icons
        const val composeMaterialIcons = "androidx.compose.material:material-icons-core:$composeVersion"
        const val composeMaterialIconsExtended = "androidx.compose.material:material-icons-extended:$composeVersion"

        // Integration with observables
        const val composeRuntimeLivedata = "androidx.compose.runtime:runtime-livedata:$composeVersion"

        // `rememberSaveable`
        const val composeRuntimeSaveable = "androidx.compose.runtime:runtime-saveable:$composeVersion"
    }

    object Google {
        const val hiltVersion = "2.40.5"

        const val hiltCore = "com.google.dagger:hilt-core:$hiltVersion"
        const val hiltCompiler = "com.google.dagger:hilt-compiler:$hiltVersion"
        const val hiltAndroid = "com.google.dagger:hilt-android:$hiltVersion"
        const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
    }

    object Test {
        private const val junitJupiterVersion = "5.8.2"
        private const val mockitoVersion = "4.0.0"

        const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion"
        const val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion"
        const val junitJupiterParams = "org.junit.jupiter:junit-jupiter-params:$junitJupiterVersion"
        const val assertJ = "org.assertj:assertj-core:3.22.0"
        const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:$mockitoVersion"
        const val mockitoInline = "org.mockito:mockito-inline:$mockitoVersion"
    }

    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinCoroutinesVersion"
    const val timber = "com.jakewharton.timber:timber:5.0.1"

}