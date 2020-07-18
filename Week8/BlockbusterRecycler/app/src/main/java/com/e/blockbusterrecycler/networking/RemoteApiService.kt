package com.e.blockbusterrecycler.networking

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RemoteApiService {

@POST("/api/register")
fun registerUser(@Body request: RequestBody: Call<ResponseBody>)

}