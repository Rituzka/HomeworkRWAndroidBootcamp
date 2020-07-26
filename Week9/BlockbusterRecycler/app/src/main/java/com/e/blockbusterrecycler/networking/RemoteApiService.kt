package com.e.blockbusterrecycler.networking


import com.e.blockbusterrecycler.model.response.GetMoviesResponse
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface RemoteApiService {

   @GET("/?apikey=8b5b7e2&s=star+wars")
    suspend fun getMovies(): GetMoviesResponse

    @GET("/?apikey=8b5b7e2&s=star+wars")
    suspend fun getBestMovies(@QueryMap query: Map<String, String>): GetMoviesResponse

    @POST("/api/register")
    fun registerUser(@Body request: RequestBody): Call<ResponseBody>

}