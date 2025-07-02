package com.example.mangamania.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mangamania.data.model.Manga
import com.example.mangamania.data.repository.MangaRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val mangaRepository: MangaRepository = MangaRepository()
) : ViewModel() {

    private val _mangaList = MutableStateFlow<List<Manga>>(emptyList())
    val mangaList: StateFlow<List<Manga>> = _mangaList

    init {
        fetchManga()
    }

    private fun fetchManga() {
    }
}
