package com.e.blockbusterrecycler.model


import androidx.room.*
import com.e.blockbusterrecycler.networking.MovieModelApi

@Dao
interface MovieDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovies(movies: List<MovieModelApi>)

    @Query("SELECT * FROM movies")
    suspend fun findAllMovies(): List<MovieModelApi>

    @Query("SELECT * FROM movies WHERE id = :movieId")
    suspend fun findMovieById(movieId: String): MovieModelApi

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: MovieModelApi)
}