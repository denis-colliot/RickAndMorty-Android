import dev.rickandmorty.Dependency

plugins {
    id("com.android.library")
    id("kotlin-android")
}

dependencies {
    implementation(Dependency.AndroidX.composeMaterial)
    implementation(Dependency.AndroidX.composeMaterialIcons)
    implementation(Dependency.AndroidX.composeMaterialIconsExtended)
}