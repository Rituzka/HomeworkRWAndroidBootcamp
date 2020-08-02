package com.e.blockbusterrecycler.repository


import androidx.lifecycle.LiveData
import com.e.blockbusterrecycler.app.App
import com.e.blockbusterrecycler.networking.ApiHelper
import com.e.blockbusterrecycler.networking.MovieModelApi


open class MovieRoomRepo(private val apiHelper: ApiHelper): MovieRepository{


    private val movieDao = App.database.movieDao()


    override fun getAllMovies(): LiveData<List<MovieModelApi>> = movieDao.findAllMovies()

    override suspend fun getMovieById(movieId: String): MovieModelApi = movieDao.findMovieById(movieId)

    suspend fun storeMovies(movies: List<MovieModelApi>)= movieDao.insertMovies(movies)

    suspend fun getMovies() = apiHelper.getMovies()

    suspend fun storeMoviesIfNotEmpty(movies: List<MovieModelApi>){
        if(movies.isNotEmpty()) movieDao.insertMovies(movies)
    }

     override suspend fun loadMoviesForPage(page: Int) {
        val movieList = apiHelper.getMovies()
        storeMoviesIfNotEmpty(movieList.movies)
    }

    override suspend fun clearMovies() {
        movieDao.clearAllMovies()
    }

}