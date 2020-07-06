package com.e.blockbusterrecycler.model


import androidx.room.Database
import androidx.room.RoomDatabase

const val DATABASE_NAME = "movie_database"

@Database(
    entities = [ModelMovie::class],
    version = 1,
    exportSchema = false
)
abstract class RoomMovieDatabase: RoomDatabase() {

    abstract fun movieDao(): MovieDAO
}

