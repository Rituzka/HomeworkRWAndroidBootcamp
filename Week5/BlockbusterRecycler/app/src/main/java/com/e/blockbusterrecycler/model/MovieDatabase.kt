package com.e.blockbusterrecycler.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.e.blockbusterrecycler.model.ModelMovies
import com.e.blockbusterrecycler.model.MovieDAO


@Database(entities = [(ModelMovies::class)], version = 1)
abstract class MovieDatabase: RoomDatabase() {

    abstract fun movieDao(): MovieDAO


}