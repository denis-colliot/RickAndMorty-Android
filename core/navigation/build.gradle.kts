import dev.rickandmorty.Dependency

plugins {
    id("kotlin")
    kotlin("kapt")
}

dependencies {
    implementation(Dependency.kotlinCoroutines)
    implementation(Dependency.Google.hiltCore)
    kapt(Dependency.Google.hiltCompiler)
}