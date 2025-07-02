package com.example.mangamania.data.repository

import com.example.mangamania.data.model.Favourite
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class FavouriteRepository(private val db: FirebaseFirestore = FirebaseFirestore.getInstance()) {
    private val favCollection = db.collection("favourites")

    suspend fun getFavouritesByUser(userId: String): List<Favourite> {
        return favCollection
            .whereEqualTo("userId", userId)
            .get().await().toObjects(Favourite::class.java)
    }

    suspend fun isFavourite(userId: String, mangaId: String): Boolean {
        val snapshot = favCollection
            .whereEqualTo("userId", userId)
            .whereEqualTo("mangaId", mangaId)
            .get().await()
        return !snapshot.isEmpty
    }

    suspend fun addFavourite(fav: Favourite) {
        favCollection.add(fav).await()
    }

    suspend fun removeFavourite(userId: String, mangaId: String) {
        val snapshot = favCollection
            .whereEqualTo("userId", userId)
            .whereEqualTo("mangaId", mangaId)
            .get().await()
        snapshot.documents.forEach { it.reference.delete().await() }
    }
}
