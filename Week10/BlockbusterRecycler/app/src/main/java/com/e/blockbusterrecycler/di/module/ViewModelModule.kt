package com.e.blockbusterrecycler.di.module

import com.e.blockbusterrecycler.viewModel.MoviesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class ViewModelModule {

    val viewModelModule = module {
        viewModel {
            MoviesViewModel(get(), get())
        }
    }
}