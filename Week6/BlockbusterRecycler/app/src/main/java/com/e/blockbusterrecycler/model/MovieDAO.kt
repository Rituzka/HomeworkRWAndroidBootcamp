package com.e.blockbusterrecycler.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MovieDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun storeMovies(movies: List<Movie>)

    @Delete
    suspend fun clearMovie(movie: Movie)

    @Query("SELECT * FROM movies")
    suspend fun getAllMovies(): List<Movie>



}