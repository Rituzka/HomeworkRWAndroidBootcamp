package com.e.blockbusterrecycler.viewModel


import androidx.lifecycle.*
import com.e.blockbusterrecycler.networking.MovieModelApi
import com.e.blockbusterrecycler.networking.NetworkStatusChecker
import com.e.blockbusterrecycler.repository.MovieRoomRepo
import com.e.blockbusterrecycler.utils.Result
import kotlinx.coroutines.launch

class MoviesViewModel(
    private val repository: MovieRoomRepo,
    private val networkHelper: NetworkStatusChecker): ViewModel() {

    private val _movies = MutableLiveData<Result<List<MovieModelApi>>>()
    val movies: LiveData<Result<List<MovieModelApi>>>
    get() = _movies

    private var counter = 1

    init {
        fetchMovies()
    }


    private fun fetchMovies() {
        viewModelScope.launch {
            _movies.postValue(Result.loading(null))
            if(networkHelper.hasInternetConnection()) {
                repository.getMovies().let {
                    if(it.isSuccessful) {
                        _movies.postValue(Result.success(it.body()))
                    }else _movies.postValue(Result.error(it.errorBody().toString(), null))
                }
            } else _movies.postValue(Result.error("No internet connection", null))
           //repository.loadMoviesForPage(counter)
       }
        counter++
    }
}