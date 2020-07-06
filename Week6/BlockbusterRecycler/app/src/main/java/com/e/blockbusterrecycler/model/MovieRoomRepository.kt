package com.e.blockbusterrecycler.model


interface MovieRoomRepository {
    fun addMovie(movie: Movie)
    fun getMovies(): List<Movie>
    fun clearMovie(movie: Movie)

}