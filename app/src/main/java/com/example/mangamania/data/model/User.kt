package com.example.mangamania.data.model

data class User(
    val id: String = "",
    val name: String = "Anonymous",
    val joinedAt: Long = System.currentTimeMillis()
)
