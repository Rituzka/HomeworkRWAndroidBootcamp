package com.e.blockbusterrecycler.repository

import com.e.blockbusterrecycler.app.MovieInjector
import com.e.blockbusterrecycler.model.ModelMovie

class MovieRepository {
    private val movieDao = MovieInjector.movieDataBase.movieDao()

    suspend fun getAllMovies(): List<ModelMovie> = movieDao.getAllMovies()

    suspend fun getMovieById(movieId: Int) = movieDao.getMovieById(movieId)

    suspend fun insertOrUpdateMovies(movie: ModelMovie) = movieDao.insertOrUpdateMovie(movie)

}