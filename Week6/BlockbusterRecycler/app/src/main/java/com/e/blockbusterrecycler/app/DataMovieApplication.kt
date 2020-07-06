package com.e.blockbusterrecycler.app

import android.app.Application
import android.content.Context
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import com.e.blockbusterrecycler.model.DATABASE_NAME
import com.e.blockbusterrecycler.model.MovieDatabase

class DataMovieApplication: Application() {

    companion object {
        lateinit var database: MovieDatabase
    }

    override fun onCreate(){
        super.onCreate()
        DataMovieApplication.database = Room.databaseBuilder(
            this,
                     MovieDatabase::class.java,
                    DATABASE_NAME
        ).build()
    }



}