package dev.rickandmorty.episode.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import dev.rickandmorty.episode.viewmodel.EpisodeDetailsViewModel

@Composable
fun EpisodeDetailsScreen(
    viewModel: EpisodeDetailsViewModel,
    episodeId: String?
) {
    Text(
        text = "TODO: Episode #$episodeId details",
        color = MaterialTheme.colors.primary,
    )
}