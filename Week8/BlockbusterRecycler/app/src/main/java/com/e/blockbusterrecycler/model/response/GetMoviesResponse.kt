package com.e.blockbusterrecycler.model.response


import com.e.blockbusterrecycler.networking.MovieModelApi
import com.google.gson.annotations.SerializedName


data class GetMoviesResponse (@SerializedName("results") val movies: List<MovieModelApi>)