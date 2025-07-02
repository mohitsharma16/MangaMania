package com.example.mangamania.ui.screen.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.mangamania.ui.components.MangaCard
import com.example.mangamania.ui.components.SectionTitle
import com.example.mangamania.ui.theme.MangaManiaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("MangaMania") }) }
    ) { contentPadding -> // 👈 Receive contentPadding here
        Column(
            modifier = Modifier
                .padding(contentPadding) // 👈 Use it here
                .padding(16.dp) // 👈 Your own padding
        ) {
            SectionTitle(title = "Home")
            Text("Welcome to MangaMania Home!", color = MaterialTheme.colorScheme.onBackground)
        }
    }
}

