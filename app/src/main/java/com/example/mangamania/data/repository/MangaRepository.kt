package com.example.mangamania.data.repository

import com.example.mangamania.data.model.Manga
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class MangaRepository(private val db: FirebaseFirestore = FirebaseFirestore.getInstance()) {
    private val mangaCollection = db.collection("manga")

    suspend fun getAllManga(): List<Manga> {
        return mangaCollection.get().await().toObjects(Manga::class.java)
    }

    suspend fun getMangaById(id: String): Manga? {
        return mangaCollection.document(id).get().await().toObject(Manga::class.java)
    }

    suspend fun uploadManga(manga: Manga) {
        mangaCollection.document(manga.id).set(manga).await()
    }
}
