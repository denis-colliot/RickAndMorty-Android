package dev.rickandmorty

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import dev.rickandmorty.episode.ui.EpisodeDetailsScreen
import dev.rickandmorty.episode.ui.EpisodesListScreen
import dev.rickandmorty.navigation.ARG_EPISODE_ID
import dev.rickandmorty.navigation.NavigationRoute

@Composable
internal fun NavigationGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.Episode.route,
        modifier = modifier
    ) {
        episodeGraph()
        characterGraph()
    }
}

private fun NavGraphBuilder.episodeGraph() {
    navigation(
        startDestination = NavigationRoute.EpisodeSearch.route,
        route = NavigationRoute.Episode.route
    ) {
        composable(route = NavigationRoute.EpisodeSearch.route) {
            EpisodesListScreen(viewModel = hiltViewModel())
        }
        composable(route = NavigationRoute.EpisodeDetails.route) { backStackEntry ->
            EpisodeDetailsScreen(
                viewModel = hiltViewModel(),
                episodeId = backStackEntry.arguments?.getString(ARG_EPISODE_ID)
            )
        }
    }
}

private fun NavGraphBuilder.characterGraph() {
    navigation(
        startDestination = NavigationRoute.CharacterSearch.route,
        route = NavigationRoute.Character.route
    ) {
        composable(route = NavigationRoute.CharacterSearch.route) {
            Text(text = "TODO: Characters")
        }
    }
}