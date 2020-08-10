package com.e.blockbusterrecycler.networking


import retrofit2.Response

interface ApiHelper {

    suspend fun getMovies(): Response <List<MovieModelApi>>
}