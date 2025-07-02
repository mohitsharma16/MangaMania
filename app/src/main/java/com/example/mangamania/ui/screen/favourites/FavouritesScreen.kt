package com.example.mangamania.ui.screen.favourites

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mangamania.ui.components.BaseScaffold
import com.example.mangamania.ui.components.SectionTitle

@Composable
fun FavouritesScreen(navController: NavHostController) {
    BaseScaffold(
        navController = navController,
        title = "Your Favourites"
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(16.dp)
        ) {
            SectionTitle(title = "Favourites")
            Text(
                text = "Here are your starred manga.",
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}
