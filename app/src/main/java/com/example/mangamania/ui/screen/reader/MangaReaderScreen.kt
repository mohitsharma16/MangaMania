package com.example.mangamania.ui.screen.reader

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.mangamania.ui.components.SectionTitle
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MangaReaderScreen(navController: NavHostController, mangaId: String) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Reader") }) }
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(16.dp)
        ) {
            SectionTitle("Reading")
            Text("Reading manga: $mangaId", color = MaterialTheme.colorScheme.onBackground)
        }
    }
}
