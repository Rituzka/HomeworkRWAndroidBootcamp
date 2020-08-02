package com.e.blockbusterrecycler.model


import androidx.room.*
import com.e.blockbusterrecycler.networking.MovieModelApi

@Dao
interface MovieDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovies(movies: List<MovieModelApi>)

    @Query("SELECT * FROM moviesData")
    suspend fun findAllMovies(): List<MovieModelApi>

    @Query("SELECT * FROM moviesData WHERE id = :movieId")
    suspend fun findMovieById(movieId: String): MovieModelApi

    @Query("DELETE FROM moviesData")
    suspend fun clearAllMovies()
}