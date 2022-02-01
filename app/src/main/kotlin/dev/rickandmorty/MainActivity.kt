package dev.rickandmorty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.rickandmorty.design.RickAndMortyTheme
import dev.rickandmorty.episode.ui.EpisodesListScreen
import dev.rickandmorty.navigation.EpisodeRoutes
import dev.rickandmorty.navigation.NavigationManager
import timber.log.Timber
import javax.inject.Inject

/**
 * Main (and only) app activity; every feature screen is provided using Jetpack Compose.
 */
@AndroidEntryPoint
internal class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationManager: NavigationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RickAndMortyTheme {
                val navController = rememberNavController()

                navigationManager.commands.collectAsState().value.also { command ->
                    if (command.destination.isNotEmpty()) {
                        Timber.d("Navigate to `%s`", command)
                        navController.navigate(command.destination)
                    }
                }

                NavHost(
                    navController = navController,
                    startDestination = EpisodeRoutes.Root.destination
                ) {
                    composable(EpisodeRoutes.Root.destination) { EpisodesListScreen() }
                    composable(EpisodeRoutes.Details.destination) { EpisodesListScreen() }
                }
            }
        }
    }

}