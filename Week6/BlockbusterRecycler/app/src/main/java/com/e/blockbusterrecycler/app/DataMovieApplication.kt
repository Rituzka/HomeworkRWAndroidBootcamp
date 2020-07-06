package com.e.blockbusterrecycler.app

import android.app.Application
import android.content.Context
import androidx.room.Room.databaseBuilder
import com.e.blockbusterrecycler.model.MovieDatabase

class DataMovieApplication: Application() {

    companion object {
        lateinit var database: MovieDatabase
        private lateinit var instance: DataMovieApplication

        fun getAppContext(): Context = instance.applicationContext
    }

    override fun onCreate() {
        instance = this
        super.onCreate()

        database = databaseBuilder(this, MovieDatabase::class.java, "movie_database").build()

    }

}

