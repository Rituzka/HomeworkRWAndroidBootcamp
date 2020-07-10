package com.e.blockbusterrecycler.app

import android.app.Application
import android.content.Context
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import com.e.blockbusterrecycler.model.MovieDatabase

const val DATABASE_NAME = "movie_database"

class DataMovieApplication: Application() {

    companion object {
       lateinit var database : MovieDatabase
    }

    override fun onCreate() {
        super.onCreate()
        DataMovieApplication.database = Room.databaseBuilder( applicationContext,
        MovieDatabase::class.java, DATABASE_NAME)
            .allowMainThreadQueries()
            .build()
    }

}

