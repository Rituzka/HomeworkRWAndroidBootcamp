package com.e.blockbusterrecycler.networking

import com.e.blockbusterrecycler.model.response.GetImagesResponse
import com.e.blockbusterrecycler.model.response.GetMoviesResponse
import com.e.blockbusterrecycler.model.response.UploadResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface RemoteApiService {

   @GET("/?apikey=8b5b7e2&s=star+wars")
 suspend fun getMovies(): GetMoviesResponse

    @POST("/api/register")
 fun registerUser(@Body request: RequestBody): Call<ResponseBody>

    @GET("/images")
    suspend fun getImages(): GetImagesResponse

    @Multipart
    @POST("/files")
    suspend fun uploadImage(@Part imageFile: MultipartBody.Part): UploadResponse

}