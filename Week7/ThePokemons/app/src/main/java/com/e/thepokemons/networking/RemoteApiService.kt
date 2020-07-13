package com.e.thepokemons.networking


import com.e.thepokemons.model.Pokemon
import com.e.thepokemons.model.response.GetPokemonsResponse
import retrofit2.Call
import retrofit2.http.GET

interface RemoteApiService {

    @GET("/pokedex.json")
    suspend fun getListPokemon(): GetPokemonsResponse

}