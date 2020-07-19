package com.e.blockbusterrecycler.model.response

import com.e.blockbusterrecycler.networking.MovieModelApi



data class GetMoviesResponse (val movies: List<MovieModelApi> = listOf())