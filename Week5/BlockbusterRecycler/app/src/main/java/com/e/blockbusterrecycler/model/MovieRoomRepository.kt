package com.e.blockbusterrecycler.model

import androidx.lifecycle.LiveData


interface MovieRoomRepository {
    fun addMovie(movie: ModelMovies)
    fun getMovies(): LiveData<List<ModelMovies>>
    fun clearMovie(movie: ModelMovies)
    fun clearAllMovies()

}