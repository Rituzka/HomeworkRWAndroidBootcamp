package com.e.blockbusterrecycler.app

import com.e.blockbusterrecycler.model.MovieRepository
import com.e.blockbusterrecycler.model.RoomRepository

object Injection {
    fun provideMovieRepository(): MovieRepository =
        RoomRepository()
}