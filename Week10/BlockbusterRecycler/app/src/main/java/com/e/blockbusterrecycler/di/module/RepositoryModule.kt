package com.e.blockbusterrecycler.di.module

import com.e.blockbusterrecycler.repository.MovieRoomRepo
import org.koin.dsl.module


val repoModule = module {
    single {
        MovieRoomRepo(get())
    }
}