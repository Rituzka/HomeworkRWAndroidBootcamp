package com.e.blockbusterrecycler.repository

import androidx.lifecycle.LiveData
import com.e.blockbusterrecycler.networking.MovieModelApi

interface MovieRepository {

    fun getAllMovies(): LiveData<List<MovieModelApi>>
    suspend fun getMovieById(movieId: String): MovieModelApi
    suspend fun loadMoviesForPage(page: Int)
    suspend fun clearMovies()

}