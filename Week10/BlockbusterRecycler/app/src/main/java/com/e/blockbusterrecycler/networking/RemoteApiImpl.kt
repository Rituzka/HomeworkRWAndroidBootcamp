package com.e.blockbusterrecycler.networking



import retrofit2.Response


class RemoteApiImpl(private val remoteApiService: RemoteApiService): ApiHelper {

    override suspend fun getMovies(): Response<List<MovieModelApi>> = remoteApiService.getMovies()


}