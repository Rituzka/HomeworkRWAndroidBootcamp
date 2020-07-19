package com.e.blockbusterrecycler.networking

import com.e.blockbusterrecycler.networking.response.MovieResponseData
import com.google.gson.Gson
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.NullPointerException

const val BASE_URL = "http://www.omdbapi.com"

class RemoteApi(private val remoteApiService: RemoteApiService) {
    private val gson =  Gson()

    fun getMovies(movies: List<MovieResponseData>){
        remoteApiService.getMovies().enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {

            }

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                val jsonBody = response.body()?.string()

                if (jsonBody == null) {
                    NullPointerException("No data available")
                    return
                }
            }
        }

}