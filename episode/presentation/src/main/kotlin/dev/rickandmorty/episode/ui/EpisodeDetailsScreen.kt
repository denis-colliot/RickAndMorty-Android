package dev.rickandmorty.episode.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import dev.rickandmorty.episode.viewmodel.EpisodeDetailsViewModel
import dev.rickandmorty.episode.viewmodel.EpisodeSearchViewModel
import dev.rickandmorty.episode.viewmodel.EpisodeViewModel
import timber.log.Timber

@Composable
fun EpisodeDetailsScreen(
    viewModel: EpisodeDetailsViewModel,
    searchViewModel: EpisodeSearchViewModel,
    sharedViewModel: EpisodeViewModel,
    episodeId: String?
) {
    Timber.tag("INSTANCES").d("[Details] Details VM = %s", viewModel)
    Timber.tag("INSTANCES").d("[Details] Search VM = %s", searchViewModel)
    Timber.tag("INSTANCES").d("[Details] Shared VM = %s", sharedViewModel)
    Text(
        text = "TODO: Episode #$episodeId details",
        color = MaterialTheme.colors.primary,
    )
}