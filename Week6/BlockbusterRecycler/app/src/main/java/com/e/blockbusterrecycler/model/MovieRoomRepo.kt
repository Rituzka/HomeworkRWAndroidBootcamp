package com.e.blockbusterrecycler.model


import com.e.blockbusterrecycler.app.DataMovieApplication


class MovieRoomRepo {

    private val movieDao = DataMovieApplication.database.movieDao()

    fun getAllMovies():List<Movie> = movieDao.findAllMovies()
    fun getMovieById(movieId: Int?)= movieDao.findMovieById(movieId)
    fun storeMovies(movies: List<Movie>)= movieDao.insertMovies(movies)
    fun storeMoviesIfNotEmpty(movies: List<Movie>){
        if(getAllMovies().count() < 1) storeMovies(movies)
    }
}