package dev.rickandmorty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.rickandmorty.design.RickAndMortyTheme
import dev.rickandmorty.navigation.NavigationManager
import dev.rickandmorty.navigation.NavigationRequest
import timber.log.Timber
import javax.inject.Inject

/**
 * Main (and only) app activity; every feature screen is provided using Jetpack Compose.
 */
@AndroidEntryPoint
internal class MainActivity : ComponentActivity() {

    companion object {
        private const val LOG_TAG_NAVIGATION = "Navigation"
    }

    @Inject
    lateinit var navigationManager: NavigationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBar?.hide()
        setContent {
            val navController = rememberNavController()

            navigationManager.route.collectAsState().value
                .let { navigationRoute -> handleNavigationRouteEvent(navController, navigationRoute) }
            configureOnBackPressedEvent(navController)

            RickAndMortyTheme {
                Scaffold(
                    bottomBar = { BottomNavigationBar(navController) }
                ) { innerPadding ->
                    NavigationGraph(navController, Modifier.padding(innerPadding))
                }
            }
        }
    }

    private fun handleNavigationRouteEvent(navController: NavController, navigationRoute: String) {
        if (navigationRoute != NavigationRequest.Default.navigationRoute.route) {
            Timber.tag(LOG_TAG_NAVIGATION).d("Navigate to route `%s`", navigationRoute)
            navController.navigate(route = navigationRoute)
            navigationManager.navigate(NavigationRequest.Default)
        }
    }

    private fun configureOnBackPressedEvent(navController: NavController) {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Timber.tag(LOG_TAG_NAVIGATION).d("Back pressed from current destination `%s`", navController.currentDestination)
                when (navController.previousBackStackEntry) {
                    null -> finish()
                    else -> navController.popBackStack()
                }
            }
        })
    }

}