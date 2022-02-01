package dev.rickandmorty.episode.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EpisodesListViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val application: Application
) : ViewModel() {

    val text = MutableLiveData<String>("Hello world!")

}