package com.e.blockbusterrecycler.viewModel


import androidx.lifecycle.*
import com.e.blockbusterrecycler.networking.MovieModelApi
import com.e.blockbusterrecycler.networking.NetworkStatusChecker
import com.e.blockbusterrecycler.repository.MovieRoomRepo
import com.e.blockbusterrecycler.utils.Resource
import kotlinx.coroutines.launch

class MoviesViewModel(
    private val repository: MovieRoomRepo,
    private val networkHelper: NetworkStatusChecker): ViewModel() {

    private val _movies = MutableLiveData<Resource<List<MovieModelApi>>>()
    val movies: LiveData<Resource<List<MovieModelApi>>>
    get() = _movies

    private var counter = 1

    init {
        fetchMovies()
    }


    private fun fetchMovies() {
        viewModelScope.launch {
            _movies.postValue(Resource.loading(null))
            if(networkHelper.hasInternetConnection()) {
                repository.getMovies().let {
                    if(it.isSuccessful) {
                        _movies.postValue(Resource.success(it.body()))
                    }else _movies.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } else _movies.postValue(Resource.error("No internet connection", null))
           //repository.loadMoviesForPage(counter)
       }
        counter++
    }
}