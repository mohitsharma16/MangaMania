package com.example.mangamania.data.repository

import com.example.mangamania.data.model.User
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class UserRepository(private val db: FirebaseFirestore = FirebaseFirestore.getInstance()) {
    private val userCollection = db.collection("users")

    suspend fun getUserById(id: String): User? {
        return userCollection.document(id).get().await().toObject(User::class.java)
    }

    suspend fun createUserIfNotExists(user: User) {
        val snapshot = userCollection.document(user.id).get().await()
        if (!snapshot.exists()) {
            userCollection.document(user.id).set(user).await()
        }
    }
}
