package dev.rickandmorty.navigation

import androidx.navigation.NamedNavArgument

sealed class EpisodeRoutes(
    override val destination: String,
    override val arguments: List<NamedNavArgument> = emptyList()
) : NavigationCommand {

    object Root : EpisodeRoutes(destination = "route.episode.list")

    object Details : EpisodeRoutes(destination = "route.episode.details")

    object Default : EpisodeRoutes(destination = "")

}