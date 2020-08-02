package com.e.blockbusterrecycler.networking

import com.e.blockbusterrecycler.model.response.GetMoviesResponse

interface ApiHelper {

    suspend fun getMovies(): GetMoviesResponse
}