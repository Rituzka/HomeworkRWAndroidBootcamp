package com.e.blockbusterrecycler.app

import android.app.Application
import androidx.room.Room
import com.e.blockbusterrecycler.model.DATABASE_NAME
import com.e.blockbusterrecycler.model.RoomMovieDatabase


class MovieInjector: Application(){

companion object {
    private lateinit var instance: MovieInjector
    lateinit var movieDataBase: RoomMovieDatabase

    fun getAppContext() = instance

}

override fun onCreate(){
    instance = this
    super.onCreate()
    initRoom()
}

    private fun initRoom() {
        movieDataBase = Room.databaseBuilder(this, RoomMovieDatabase::class.java, DATABASE_NAME)
            .allowMainThreadQueries()
            .build()
    }
}

