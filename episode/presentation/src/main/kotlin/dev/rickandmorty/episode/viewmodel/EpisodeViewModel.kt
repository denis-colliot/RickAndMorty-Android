package dev.rickandmorty.episode.viewmodel

import android.app.Application
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.rickandmorty.navigation.NavigationManager
import javax.inject.Inject

@HiltViewModel
class EpisodeViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val application: Application,
    private val navigationManager: NavigationManager
) : ViewModel() {

}