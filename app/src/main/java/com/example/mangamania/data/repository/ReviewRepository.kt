package com.example.mangamania.data.repository

import com.example.mangamania.data.model.Review
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class ReviewRepository(private val db: FirebaseFirestore = FirebaseFirestore.getInstance()) {
    private val reviewCollection = db.collection("reviews")

    suspend fun getReviewsForManga(mangaId: String): List<Review> {
        return reviewCollection
            .whereEqualTo("mangaId", mangaId)
            .get().await().toObjects(Review::class.java)
    }

    suspend fun addReview(review: Review) {
        reviewCollection.document(review.id).set(review).await()
    }
}
