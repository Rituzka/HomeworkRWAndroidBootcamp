package com.e.blockbusterrecycler.model

import androidx.room.*

@Dao
interface MovieDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateMovie(movie: ModelMovie)

    @Delete
    suspend fun clearMovie(movie: ModelMovie)

    @Query("SELECT * FROM movies")
    suspend fun getAllMovies(): List<ModelMovie>

    @Query("SELECT * FROM movies WHERE id = :id")
    suspend fun getMovieById(id: Int): ModelMovie
}