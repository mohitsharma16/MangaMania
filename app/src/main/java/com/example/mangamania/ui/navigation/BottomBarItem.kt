package com.example.mangamania.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarItem(val route: String, val icon: ImageVector, val title: String) {
    object Home : BottomBarItem("home", Icons.Default.Home, "Home")
    object Favourites : BottomBarItem("favourites", Icons.Default.Star, "Favourites")
    object Upload : BottomBarItem("upload", Icons.Default.Send, "Upload")

    companion object {
        val items = listOf(Home, Favourites, Upload)
    }
}
