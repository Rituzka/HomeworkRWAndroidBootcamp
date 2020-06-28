package com.e.blockbusterrecycler.model

import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.e.blockbusterrecycler.app.DataMovieApplication

class RoomRepository: MovieRoomRepository {
    private val movieDao : MovieDAO = DataMovieApplication.database.movieDao()
    private val allMovies: LiveData<List<ModelMovies>>

    init {
        allMovies = movieDao.getAllMovies()
    }

    override fun addMovie(movie: ModelMovies) {
        InsertAsyncTask(movieDao).execute(movie)
    }

    override fun getMovie() = allMovies

    override fun clearMovie(movie: ModelMovies) {

    }

    override fun clearAllMovies() {

    }
    private class InsertAsyncTask internal constructor(private val dao: MovieDAO) :
        AsyncTask<ModelMovies, Void, Void>() {
        override fun doInBackground(vararg params: ModelMovies): Void? {
            dao.insert(params[0])
            return null
        }
    }

}