package com.e.blockbusterrecycler.app

import android.app.Application
import androidx.room.Room
import com.e.blockbusterrecycler.model.MovieDatabase
import com.e.blockbusterrecycler.networking.RemoteApi
import com.e.blockbusterrecycler.networking.buildApiService

const val DATABASE_NAME = "moviesData"

class App: Application() {

    companion object {

       lateinit var database:  MovieDatabase
        private val apiService by lazy { buildApiService()}
        val remoteApi by lazy { RemoteApi(apiService) }

    }

    override fun onCreate() {
        super.onCreate()
        App.database = Room.databaseBuilder( applicationContext,
        MovieDatabase::class.java, DATABASE_NAME)
            .build()
    }

}

