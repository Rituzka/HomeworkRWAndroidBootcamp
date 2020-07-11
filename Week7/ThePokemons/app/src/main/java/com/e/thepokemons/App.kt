package com.e.thepokemons

import com.e.thepokemons.networking.RemoteApi
import com.e.thepokemons.networking.buildApiService

class App {

    companion object {

        fun getToken() = R.string.KEY_TOKEN
        private val apiService by lazy { buildApiService() }
        val remoteApi by lazy { RemoteApi(apiService) }

    }
}