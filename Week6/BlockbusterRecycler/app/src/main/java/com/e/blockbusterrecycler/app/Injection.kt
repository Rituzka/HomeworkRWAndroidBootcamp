package com.e.blockbusterrecycler.app

import com.e.blockbusterrecycler.model.MovieRoomRepository
import com.e.blockbusterrecycler.model.RoomRepository

object Injection {
    fun provideMovieRepository(): MovieRoomRepository =
        RoomRepository()
}