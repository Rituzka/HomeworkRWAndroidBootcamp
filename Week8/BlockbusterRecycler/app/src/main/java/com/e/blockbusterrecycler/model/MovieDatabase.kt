package com.e.blockbusterrecycler.model


import androidx.room.Database
import androidx.room.RoomDatabase
import com.e.blockbusterrecycler.networking.MovieModelApi


@Database(entities = [MovieModelApi::class], version = 1, exportSchema = false )

abstract class MovieDatabase: RoomDatabase() {
    abstract fun movieDao(): MovieDAO

}