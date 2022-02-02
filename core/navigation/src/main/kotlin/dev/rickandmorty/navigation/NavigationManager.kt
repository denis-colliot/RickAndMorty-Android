package dev.rickandmorty.navigation

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Singleton

@Singleton
class NavigationManager {

    val route: StateFlow<String> get() = _route
    private val _route = MutableStateFlow(NavigationRequest.Default.navigationRoute.route)

    fun navigate(request: NavigationRequest) {
        _route.value = request.toRoute()
    }

    private fun NavigationRequest.toRoute(): String {
        var resultRoute: String = navigationRoute.route
        arguments.forEach { (argKey, argValue) ->
            resultRoute = resultRoute.replace("{$argKey}", argValue.toString())
        }
        return resultRoute
    }

}