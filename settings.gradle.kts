@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Rick and Morty"

include(":app")

include(":core:design")
include(":core:navigation")

include(":episode:presentation")
include(":episode:domain")
