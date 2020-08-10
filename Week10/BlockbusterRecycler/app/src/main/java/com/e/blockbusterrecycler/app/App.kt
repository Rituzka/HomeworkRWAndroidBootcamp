package com.e.blockbusterrecycler.app

import android.app.Application
import androidx.room.Room
import com.e.blockbusterrecycler.di.module.appModule
import com.e.blockbusterrecycler.di.module.repoModule
import com.e.blockbusterrecycler.di.module.viewModelModule
import com.e.blockbusterrecycler.model.MovieDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

const val DATABASE_NAME = "moviesData"

class App: Application() {

    companion object {
        lateinit var database:  MovieDatabase
    }


    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }

        App.database = Room.databaseBuilder( applicationContext,
        MovieDatabase::class.java, DATABASE_NAME)
            .build()
    }
}

