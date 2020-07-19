package com.e.blockbusterrecycler.repository


import com.e.blockbusterrecycler.app.App
import com.e.blockbusterrecycler.networking.MovieModelApi


class MovieRoomRepo {

    private val movieDao = App.database.movieDao()

    suspend fun getAllMovies():List<MovieModelApi> = movieDao.findAllMovies()
    suspend fun getMovieById(movieId: String)= movieDao.findMovieById(movieId)
    suspend fun storeMovies(movies: List<MovieModelApi>)= movieDao.insertMovies(movies)
    suspend fun storeMoviesIfNotEmpty(movies: List<MovieModelApi>){
        if(getAllMovies().count() < 1) storeMovies(movies)
    }
}