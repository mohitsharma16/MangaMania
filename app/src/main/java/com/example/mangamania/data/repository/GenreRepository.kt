package com.example.mangamania.data.repository

import com.example.mangamania.data.model.Genre
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GenreRepository {
    // Static genres for MVP
    suspend fun getGenres(): List<Genre> = withContext(Dispatchers.Default) {
        listOf(
            Genre("Action", android.R.drawable.ic_menu_compass),
            Genre("Comedy", android.R.drawable.ic_menu_camera),
            Genre("Drama", android.R.drawable.ic_menu_agenda),
            Genre("Fantasy", android.R.drawable.ic_menu_gallery),
            Genre("Horror", android.R.drawable.ic_menu_report_image)
        )
    }
}
