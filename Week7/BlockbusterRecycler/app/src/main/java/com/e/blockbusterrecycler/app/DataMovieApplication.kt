package com.e.blockbusterrecycler.app

import android.app.Application
import androidx.room.Room.databaseBuilder
import com.e.blockbusterrecycler.model.MovieDatabase

const val DATABASE_NAME = "movie_database"

class DataMovieApplication: Application() {

    companion object {
       lateinit var database : MovieDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = databaseBuilder( applicationContext,
        MovieDatabase::class.java, DATABASE_NAME)
            .build()
    }

}

