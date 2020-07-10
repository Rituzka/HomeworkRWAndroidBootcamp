package com.e.blockbusterrecycler.model


import androidx.room.*

@Dao
interface MovieDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies: List<Movie>)

    @Query("SELECT * FROM movies")
    fun findAllMovies(): List<Movie>

    @Query("SELECT * FROM movies WHERE id = :movieId")
    fun findMovieById(movieId: Int?): Movie

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(movie: Movie)
}