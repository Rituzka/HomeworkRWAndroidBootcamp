package com.e.blockbusterrecycler.repository


import com.e.blockbusterrecycler.app.App
import com.e.blockbusterrecycler.networking.MovieModelApi
import com.e.blockbusterrecycler.networking.RemoteApiService
import com.e.blockbusterrecycler.networking.getMoviesQuery



open class MovieRoomRepo(private val movieApiService: RemoteApiService){


    private val movieDao = App.database.movieDao()


    suspend fun getAllMovies():List<MovieModelApi> = movieDao.findAllMovies()

    suspend fun getMovieById(movieId: String): MovieModelApi = movieDao.findMovieById(movieId)

    suspend fun storeMovies(movies: List<MovieModelApi>)= movieDao.insertMovies(movies)

    suspend fun storeMoviesIfNotEmpty(movies: List<MovieModelApi>){
        if(getAllMovies().count() < 1) storeMovies(movies)
    }

     suspend fun loadMoviesForPage(page: Int) {
        val movieList = movieApiService.getBestMovies(getMoviesQuery(page))
        storeMoviesIfNotEmpty(movieList.movies)
    }

    suspend fun clearMovies() {
        movieDao.clearAllMovies()
    }

}