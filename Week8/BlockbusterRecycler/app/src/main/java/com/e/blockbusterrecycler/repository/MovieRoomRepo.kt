package com.e.blockbusterrecycler.repository


import com.e.blockbusterrecycler.app.DataMovieApplication
import com.e.blockbusterrecycler.model.Movie


class MovieRoomRepo {

    private val movieDao = DataMovieApplication.database.movieDao()

    suspend fun getAllMovies():List<Movie> = movieDao.findAllMovies()
    suspend fun getMovieById(movieId: Int?)= movieDao.findMovieById(movieId)
    suspend fun storeMovies(movies: List<Movie>)= movieDao.insertMovies(movies)
    suspend fun storeMoviesIfNotEmpty(movies: List<Movie>){
        if(getAllMovies().count() < 1) storeMovies(movies)
    }
}