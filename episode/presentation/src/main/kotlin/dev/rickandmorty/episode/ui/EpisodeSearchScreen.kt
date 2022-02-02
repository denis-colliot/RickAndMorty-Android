package dev.rickandmorty.episode.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import dev.rickandmorty.episode.viewmodel.EpisodeSearchViewModel

@Composable
fun EpisodesListScreen(viewModel: EpisodeSearchViewModel) {
    val text = viewModel.text.observeAsState().value
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {
        Text(
            text = text.orEmpty(),
            color = MaterialTheme.colors.primary,
            modifier = Modifier.clickable { viewModel.onTextClick() }
        )
        Button(
            onClick = viewModel::onDetailsBtnClick
        ) {
            Text(
                text = "Go to details",
                color = MaterialTheme.colors.secondary
            )
        }
    }
}