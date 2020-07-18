package com.e.blockbusterrecycler.networking

import com.google.gson.Gson

const val BASE_URL = "http://www.omdbapi.com/?"

class RemoteApi(private val remoteApiService: RemoteApiService) {
    private val gson =  Gson()

    fun registerUser()

}