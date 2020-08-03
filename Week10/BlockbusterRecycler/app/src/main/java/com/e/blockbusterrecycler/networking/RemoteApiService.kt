package com.e.blockbusterrecycler.networking

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

const val API_KEY = "8b5b7e2"

interface RemoteApiService {

   @GET("/?apikey=$API_KEY&s=star+wars")
    suspend fun getMovies(): Response<List<MovieModelApi>>

    @GET("/?apikey=$API_KEY&s=star+wars")
    suspend fun getBestMovies(@QueryMap query: Map<String, String>): Response<List<MovieModelApi>>

    @POST("/api/register")
    fun registerUser(@Body request: RequestBody): Call<ResponseBody>

}