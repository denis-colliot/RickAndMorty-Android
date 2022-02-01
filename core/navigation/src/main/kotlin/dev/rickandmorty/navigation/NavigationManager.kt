package dev.rickandmorty.navigation

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class NavigationManager {

    val commands: StateFlow<NavigationCommand> get() = _commands
    private val _commands = MutableStateFlow<NavigationCommand>(EpisodeRoutes.Default)

    fun navigate(directions: NavigationCommand) {
        _commands.value = directions
    }

}