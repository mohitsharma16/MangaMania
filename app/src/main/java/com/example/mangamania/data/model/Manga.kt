package com.example.mangamania.data.model

data class Manga(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val genre: List<String> = emptyList(),
    val coverImageUrl: String = "",
    val uploaderId: String = "",
    val pages: List<String> = emptyList(), // URLs to each manga page
    val timestamp: Long = System.currentTimeMillis()
)
