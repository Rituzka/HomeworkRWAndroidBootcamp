package com.e.blockbusterrecycler.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.e.blockbusterrecycler.app.Injection
import com.e.blockbusterrecycler.model.ModelMovies

class MoviesViewModel(application: Application): AndroidViewModel(application)  {
    private val repository = Injection.provideMovieRepository()
    private val allMovies = repository.getMovies()

    fun getMovies() = allMovies

    fun insert(movie: ModelMovies) = repository.addMovie(movie)

    fun clearAllMovies() = repository.clearAllMovies()
    fun clearMovie(movie: ModelMovies)= repository.clearMovie(movie)

}