package com.e.blockbusterrecycler.viewModel


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.e.blockbusterrecycler.networking.MovieModelApi
import com.e.blockbusterrecycler.repository.MovieRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MoviesViewModel( private val repository: MovieRepository ): ViewModel() {

    private val moviesLiveData = repository.getAllMovies()
    private var counter = 1

    fun getMoviesLiveData(): LiveData<List<MovieModelApi>> = moviesLiveData

    fun fetchMovies() {
       GlobalScope.launch {
           repository.loadMoviesForPage(counter)
           counter++
       }
    }

}