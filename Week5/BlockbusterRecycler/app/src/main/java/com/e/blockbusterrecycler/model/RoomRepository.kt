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

    override fun getMovies() = allMovies

    override fun clearMovie(movie: ModelMovies) {
    DeleteAsyncTask(movieDao).execute(movie)
    }

    override fun clearAllMovies() {
    val movieArray = allMovies.value?.toTypedArray()
        if(movieArray!= null){
            DeleteAsyncTask(movieDao).execute(*movieArray)
        }
    }
    private class InsertAsyncTask internal constructor(private val dao: MovieDAO) :
        AsyncTask<ModelMovies, Void, Void>() {
        override fun doInBackground(vararg params: ModelMovies): Void? {
            dao.insert(params[0])
            return null
        }
    }

    private class DeleteAsyncTask internal constructor(private val dao: MovieDAO) : AsyncTask<ModelMovies, Void, Void>() {
        override fun doInBackground(vararg params: ModelMovies): Void? {
            dao.clearMovies(*params)
            return null
        }
    }
}