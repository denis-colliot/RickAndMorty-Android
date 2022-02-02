package dev.rickandmorty.navigation

const val ARG_EPISODE_ID = "episodeId"
const val ARG_CHARACTER_ID = "characterId"

/**
 * App navigation route.
 */
sealed class NavigationRoute(val route: String) {

    object Default : NavigationRoute("")

    object Episode : NavigationRoute("episode")
    object EpisodeSearch : NavigationRoute("episode/search")
    object EpisodeDetails : NavigationRoute("episode/{$ARG_EPISODE_ID}")

    object Character : NavigationRoute("character")
    object CharacterSearch : NavigationRoute("character/search")
    object CharacterDetails : NavigationRoute("character/{$ARG_CHARACTER_ID}")

}

/**
 * Request to navigate towards a [NavigationRoute].
 */
sealed class NavigationRequest(
    val navigationRoute: NavigationRoute,
    val arguments: Map<String, Any> = emptyMap()
) {

    object Default : NavigationRequest(navigationRoute = NavigationRoute.Default)

    object EpisodeSearch : NavigationRequest(navigationRoute = NavigationRoute.EpisodeSearch)

    data class EpisodeDetails(val episodeId: String) : NavigationRequest(
        navigationRoute = NavigationRoute.EpisodeDetails,
        arguments = mapOf(ARG_EPISODE_ID to episodeId)
    )

}