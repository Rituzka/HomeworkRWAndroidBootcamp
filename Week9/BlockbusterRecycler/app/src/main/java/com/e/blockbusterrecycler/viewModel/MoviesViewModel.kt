package com.e.blockbusterrecycler.viewModel


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.e.blockbusterrecycler.networking.MovieModelApi
import com.e.blockbusterrecycler.repository.MovieRepository
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MoviesViewModel( private val repository: MovieRepository ): ViewModel() {

    private val moviesLiveData = repository.getAllMovies()
    private var counter = 1

    fun getMoviesLiveData(): LiveData<List<MovieModelApi>> = moviesLiveData

    fun fetchMovies() {
        GlobalScope.launch(Dispatchers.IO) {
           repository.loadMoviesForPage(counter)
       }
        counter++
    }

}