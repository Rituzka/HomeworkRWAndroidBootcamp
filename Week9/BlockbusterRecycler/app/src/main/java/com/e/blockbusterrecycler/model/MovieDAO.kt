package com.e.blockbusterrecycler.model

import androidx.lifecycle.LiveData
import androidx.room.*
import com.e.blockbusterrecycler.networking.MovieModelApi

@Dao
interface MovieDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovies(movies: List<MovieModelApi>)

    @Query("SELECT * FROM moviesData")
    fun findAllMovies(): LiveData<List<MovieModelApi>>

    @Query("SELECT * FROM moviesData WHERE id = :movieId")
    suspend fun findMovieById(movieId: String): MovieModelApi

    @Query("DELETE FROM moviesData")
    suspend fun clearAllMovies()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: MovieModelApi)
}