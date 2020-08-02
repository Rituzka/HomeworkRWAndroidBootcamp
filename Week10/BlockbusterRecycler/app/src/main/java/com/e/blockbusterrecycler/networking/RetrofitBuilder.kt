package com.e.blockbusterrecycler.networking


import java.util.HashMap

private const val API_KEY = "8b5b7e2&s"
private const val KEY_PAGE = "page"
private const val KEY_API = "api_key"
const val BASE_URL = "http://www.omdbapi.com"

//default builder, then we will use customers interceptors

fun getMoviesQuery(page: Int): Map<String, String> {
    val queryMap = HashMap<String, String>()

    queryMap[KEY_PAGE] = page.toString()
    queryMap[KEY_API] = API_KEY

    return queryMap
}
