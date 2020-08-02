package com.e.blockbusterrecycler.networking


import com.e.blockbusterrecycler.model.response.GetMoviesResponse


class RemoteApiImpl(private val remoteApiService: RemoteApiService): ApiHelper {

    override suspend fun getMovies(): GetMoviesResponse = remoteApiService.getMovies()


}