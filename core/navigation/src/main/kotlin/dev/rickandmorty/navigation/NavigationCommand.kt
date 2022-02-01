package dev.rickandmorty.navigation

import androidx.navigation.NamedNavArgument

sealed interface NavigationCommand {

    val arguments: List<NamedNavArgument>

    val destination: String

}