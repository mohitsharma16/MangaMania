package com.example.mangamania.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview


private val DarkColorScheme = darkColorScheme(
    primary = White,
    onPrimary = Black,
    background = Black,
    onBackground = White,
    surface = DarkGray,
    onSurface = White,
    secondary = AccentPink,
    onSecondary = White
)

private val LightColorScheme = lightColorScheme(
    primary = Black,
    onPrimary = White,
    background = White,
    onBackground = Black,
    surface = LightGray,
    onSurface = Black,
    secondary = AccentPink,
    onSecondary = White
)

@Composable
fun MangaManiaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography, // uses fonts from Typography.kt
        content = content
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewMangaTheme() {
    MangaManiaTheme {
        Text("Read Manga!", style = MaterialTheme.typography.displayLarge)
    }
}
