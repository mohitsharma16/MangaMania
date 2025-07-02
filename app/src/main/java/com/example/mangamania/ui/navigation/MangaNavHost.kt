package com.example.mangamania.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mangamania.ui.screen.detail.DetailScreen
import com.example.mangamania.ui.screen.favourites.FavouritesScreen
import com.example.mangamania.ui.screen.home.HomeScreen
import com.example.mangamania.ui.screen.reader.MangaReaderScreen
import com.example.mangamania.ui.screen.review.ReviewScreen
import com.example.mangamania.ui.screen.upload.UploadScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Detail : Screen("detail")
    object Reader : Screen("reader")
    object Review : Screen("review")
    object Upload : Screen("upload")
    object Favourites : Screen("favourites")
}

@Composable
fun MangaNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) { HomeScreen(navController) }
        composable(Screen.Detail.route) { DetailScreen(
            navController,
            mangaId = TODO()
        ) }
        composable(Screen.Reader.route) { MangaReaderScreen(
            navController,
            mangaId = TODO()
        ) }
        composable(Screen.Review.route) { ReviewScreen(
            navController,
            mangaId = TODO()
        ) }
        composable(Screen.Upload.route) { UploadScreen(navController) }
        composable(Screen.Favourites.route) { FavouritesScreen(navController) }
    }
}
