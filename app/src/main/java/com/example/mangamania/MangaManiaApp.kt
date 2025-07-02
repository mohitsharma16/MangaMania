package com.example.mangamania

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.rememberNavController
import com.example.mangamania.data.AuthManager
import com.example.mangamania.ui.navigation.MangaNavHost
import com.example.mangamania.ui.theme.MangaManiaTheme

@Composable
fun MangaManiaApp() {
    val context = LocalContext.current

    // Sign in anonymously when app starts
    LaunchedEffect(Unit) {
        AuthManager.signInAnonymously(
            onSuccess = { uid -> Log.d("App", "Logged in as $uid") },
            onFailure = { e -> Log.e("App", "Login failed", e) }
        )
    }

    MangaManiaTheme {
        val navController = rememberNavController()
        MangaNavHost(navController = navController)
    }
}
