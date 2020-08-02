package com.e.blockbusterrecycler.di.module

import com.e.blockbusterrecycler.viewModel.MoviesViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


    val viewModelModule = module {
        viewModel {
            MoviesViewModel(get(), get())
        }
    }
