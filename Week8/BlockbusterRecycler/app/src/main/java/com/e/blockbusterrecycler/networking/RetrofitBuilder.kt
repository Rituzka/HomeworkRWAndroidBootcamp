package com.e.blockbusterrecycler.networking

import okhttp3.OkHttpClient
import retrofit2.Retrofit

//default builder, then we will use customers interceptors
fun buildClient(): OkHttpClient =
    OkHttpClient.Builder()
        .build()

fun buildRetrofit(): Retrofit {
    return Retrofit.Builder()
        .client(buildClient())
        .baseUrl(BASE_URL)
        .build()
}

fun buildApiService(): RemoteApiService =
    buildRetrofit().create(RemoteApiService::class.java)