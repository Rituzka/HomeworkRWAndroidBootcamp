package com.e.blockbusterrecycler.model

import androidx.lifecycle.LiveData
import com.e.blockbusterrecycler.model.ModelMovies

interface MovieRoomRepository {
    fun addMovie(movie: ModelMovies)
    fun getMovie(): LiveData<List<ModelMovies>>
    fun clearMovie(movie: ModelMovies)
    fun clearAllMovies()

}