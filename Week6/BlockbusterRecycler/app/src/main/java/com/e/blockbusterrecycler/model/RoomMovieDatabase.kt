package com.e.blockbusterrecycler.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

const val DATABASE = "movies"

@Database(
    entities = [(ModelMovie::class)],
    version = 1,
    exportSchema = false
)
abstract class RoomMovieDatabase: RoomDatabase() {

    abstract fun movieDao(): MovieDAO
}

