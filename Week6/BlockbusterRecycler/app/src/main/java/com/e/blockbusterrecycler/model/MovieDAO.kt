package com.e.blockbusterrecycler.model

import androidx.room.*


@Dao
interface MovieDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun storeMovies(movies: List<ModelMovie>)

    @Query("SELECT * FROM ModelMovie")
    fun fetchMovies(): List<ModelMovie>

    @Query("SELECT * FROM ModelMovie WHERE id = :movieId")
     fun fetchMovieById(movieId: Int?): ModelMovie
}