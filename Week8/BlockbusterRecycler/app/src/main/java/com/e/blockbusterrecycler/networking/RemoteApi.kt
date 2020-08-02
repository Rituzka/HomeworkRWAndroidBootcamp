package com.e.blockbusterrecycler.networking

import com.e.blockbusterrecycler.model.Failure
import com.e.blockbusterrecycler.model.Result
import com.e.blockbusterrecycler.model.Success


const val BASE_URL = "http://www.omdbapi.com"

class RemoteApi(private val remoteApiService: RemoteApiService) {


    suspend fun getMovies(): Result<List<MovieModelApi>> = try {
        val data = remoteApiService.getMovies()
        Success(data.movies)

    } catch (error: Throwable) {
        Failure(error)
    }

}