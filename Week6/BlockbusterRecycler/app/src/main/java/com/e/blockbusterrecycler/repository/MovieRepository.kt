package com.e.blockbusterrecycler.repository

import com.e.blockbusterrecycler.app.MovieInjector
import com.e.blockbusterrecycler.model.ModelMovie

class MovieRepository {

    private val movieDao = MovieInjector.movieDataBase.movieDao()

    fun getAllMovies() = movieDao.fetchMovies()

    fun getMovieById(movieId: Int?) = movieDao.fetchMovieById(movieId)

    fun storeMovies(movies: List<ModelMovie>) = movieDao.storeMovies(movies)

     fun storeMoviesIfNotEmpty(movies: List<ModelMovie>) {
        if (getAllMovies().count() < 1) storeMovies(movies)
    }

}