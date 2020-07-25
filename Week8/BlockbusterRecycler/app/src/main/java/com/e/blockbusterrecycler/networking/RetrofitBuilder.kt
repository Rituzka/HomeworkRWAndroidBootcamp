package com.e.blockbusterrecycler.networking

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.HashMap

private const val API_KEY = "8b5b7e2&s"
private const val KEY_PAGE = "page"
private const val KEY_API = "api_key"

//default builder, then we will use customers interceptors
fun buildClient(): OkHttpClient =
    OkHttpClient.Builder()
        .build()

fun buildRetrofit(): Retrofit {
    val contentType = "application/json".toMediaType()

    return Retrofit.Builder()
        .client(buildClient())
        .baseUrl(BASE_URL)
        .addConverterFactory(Json.nonstrict.asConverterFactory(contentType))
        .build()
}

fun getMoviesQuery(page: Int): Map<String, String> {
    val queryMap = HashMap<String, String>()

    queryMap[KEY_PAGE] = page.toString()
    queryMap[KEY_API] = API_KEY

    return queryMap
}

fun buildApiService(): RemoteApiService =
    buildRetrofit().create(RemoteApiService::class.java)