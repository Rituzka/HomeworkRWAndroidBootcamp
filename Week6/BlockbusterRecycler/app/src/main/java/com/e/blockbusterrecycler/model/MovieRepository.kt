package com.e.blockbusterrecycler.model

import com.e.blockbusterrecycler.app.DataMovieApplication


class MovieRepository {
    private val movieDao = DataMovieApplication.database.movieDao()

    suspend fun getAllMovies() = movieDao.getAllMovies()


    suspend fun storeMovies(movies: List<Movie>) = movieDao.storeMovies(movies)

    suspend fun storeMoviesIfNotEmpty(movies: List<Movie>) {
        if (getAllMovies().count() < 1) storeMovies(movies)
    }
}