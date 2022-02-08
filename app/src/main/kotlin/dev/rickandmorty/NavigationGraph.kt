package dev.rickandmorty

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import dev.rickandmorty.episode.ui.EpisodeDetailsScreen
import dev.rickandmorty.episode.ui.EpisodesSearchScreen
import dev.rickandmorty.navigation.ARG_EPISODE_ID
import dev.rickandmorty.navigation.NavigationRoute

@Composable
internal fun NavigationGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.Episode.route,
        modifier = modifier
    ) {
        episodeGraph(navController, NavigationRoute.Episode)
        characterGraph(navController, NavigationRoute.Character)
    }
}

private fun NavGraphBuilder.episodeGraph(navController: NavController, parentRoute: NavigationRoute) {
    navigation(
        startDestination = NavigationRoute.EpisodeSearch.route,
        route = parentRoute.route
    ) {
        composable(route = NavigationRoute.EpisodeSearch.route) {
            val parentRouteBackStackEntry = remember { navController.getBackStackEntry(parentRoute.route) }
            EpisodesSearchScreen(
                viewModel = hiltViewModel(),
                sharedViewModel = hiltViewModel(parentRouteBackStackEntry)
            )
        }
        composable(route = NavigationRoute.EpisodeDetails.route) { backStackEntry ->
            val parentRouteBackStackEntry = remember { navController.getBackStackEntry(parentRoute.route) }
            EpisodeDetailsScreen(
                viewModel = hiltViewModel(),
                searchViewModel = hiltViewModel(),
                sharedViewModel = hiltViewModel(parentRouteBackStackEntry),
                episodeId = backStackEntry.arguments?.getString(ARG_EPISODE_ID)
            )
        }
    }
}

private fun NavGraphBuilder.characterGraph(navController: NavController, parentRoute: NavigationRoute) {
    navigation(
        startDestination = NavigationRoute.CharacterSearch.route,
        route = parentRoute.route
    ) {
        composable(route = NavigationRoute.CharacterSearch.route) {
            Text(text = "TODO: Characters")
        }
    }
}