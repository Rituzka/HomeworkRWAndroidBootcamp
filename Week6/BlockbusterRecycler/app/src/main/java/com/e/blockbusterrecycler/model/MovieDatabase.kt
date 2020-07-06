package com.e.blockbusterrecycler.model


import androidx.room.Database
import androidx.room.RoomDatabase

const val DATABASE_NAME = "database_name"

@Database(entities = [Movie::class], version = 1)
abstract class MovieDatabase: RoomDatabase() {

    abstract fun movieDao(): MovieDAO


}

