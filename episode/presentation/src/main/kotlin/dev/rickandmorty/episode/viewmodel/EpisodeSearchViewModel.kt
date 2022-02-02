package dev.rickandmorty.episode.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.rickandmorty.navigation.NavigationManager
import dev.rickandmorty.navigation.NavigationRequest
import javax.inject.Inject

@HiltViewModel
class EpisodeSearchViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val application: Application,
    private val navigationManager: NavigationManager
) : ViewModel() {

    val text = MutableLiveData<String>("Hello world!")

    fun onTextClick() {
        text.value = text.value + text.value
    }

    fun onDetailsBtnClick() {
        navigationManager.navigate(NavigationRequest.EpisodeDetails(episodeId = "TODO"))
    }

}