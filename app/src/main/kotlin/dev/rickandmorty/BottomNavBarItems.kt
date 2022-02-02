package dev.rickandmorty

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MovieCreation
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import dev.rickandmorty.navigation.NavigationRoute

internal data class BottomNavBarItem(
    @StringRes val labelResId: Int,
    val icon: ImageVector,
    val route: NavigationRoute
)

internal val bottomBarNavItems = listOf(
    BottomNavBarItem(
        labelResId = R.string.bottom_nav_bar_episodes,
        icon = Icons.Filled.MovieCreation,
        route = NavigationRoute.Episode
    ),
    BottomNavBarItem(
        labelResId = R.string.bottom_nav_bar_character,
        icon = Icons.Filled.Person,
        route = NavigationRoute.Character
    )
)