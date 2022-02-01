package dev.rickandmorty.episode.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import dev.rickandmorty.episode.viewmodel.EpisodesListViewModel

@Composable
fun EpisodesListScreen(viewModel: EpisodesListViewModel = hiltViewModel()) {
    Text(text = "Hello compose world!")
}