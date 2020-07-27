package com.e.blockbusterrecycler.app

import android.app.Application
import androidx.room.Room
import com.e.blockbusterrecycler.model.MovieDatabase
import com.e.blockbusterrecycler.networking.RemoteApi
import com.e.blockbusterrecycler.networking.buildApiService
import com.e.blockbusterrecycler.repository.MovieRoomRepo

const val DATABASE_NAME = "moviesData"

class App: Application() {

    companion object {
        private lateinit var instance: App
        lateinit var database:  MovieDatabase
        private val apiService by lazy { buildApiService()}
        val remoteApi by lazy { RemoteApi(apiService) }

        fun getAppContext() = instance

    }

    override fun onCreate() {
        super.onCreate()
        App.database = Room.databaseBuilder( applicationContext,
        MovieDatabase::class.java, DATABASE_NAME)
            .build()
    }
}

