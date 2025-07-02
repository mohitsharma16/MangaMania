package com.example.mangamania.data

import android.util.Log
import com.google.firebase.auth.FirebaseAuth

object AuthManager {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    fun signInAnonymously(onSuccess: (String) -> Unit, onFailure: (Exception) -> Unit) {
        if (auth.currentUser != null) {
            onSuccess(auth.currentUser!!.uid)
            return
        }

        auth.signInAnonymously()
            .addOnSuccessListener {
                val uid = it.user?.uid ?: ""
                Log.d("AuthManager", "Signed in anonymously: $uid")
                onSuccess(uid)
            }
            .addOnFailureListener { e ->
                Log.e("AuthManager", "Anonymous sign-in failed", e)
                onFailure(e)
            }
    }

    fun getCurrentUserId(): String? = auth.currentUser?.uid
}
