package com.example.mangamania.data.model

data class Review(
    val id: String = "",
    val mangaId: String = "",
    val userId: String = "",
    val username: String = "Anonymous",
    val rating: Float = 0f, // 1.0 to 5.0
    val comment: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
