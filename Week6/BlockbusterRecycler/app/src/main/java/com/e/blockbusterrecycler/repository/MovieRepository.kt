package com.e.blockbusterrecycler.repository

import com.e.blockbusterrecycler.app.MovieInjector
import com.e.blockbusterrecycler.model.ModelMovie

class MovieRepository {
    private val movieDao = MovieInjector.movieDataBase.movieDao()

    fun getAllMovies(): List<ModelMovie> = movieDao.getAllMovies()

    fun getMovieById(movieId: Int) = movieDao.getMovieById(movieId)

    fun insertOrUpdateMovies(movies: List<ModelMovie>) = movieDao.insertOrUpdateMovie(movies)

}