package com.example.mangamania.data.model

data class Favourite(
    val mangaId: String = "",
    val userId: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
