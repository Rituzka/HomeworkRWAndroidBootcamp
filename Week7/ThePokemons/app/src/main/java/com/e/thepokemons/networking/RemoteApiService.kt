package com.e.thepokemons.networking


import com.e.thepokemons.model.Pokemon
import com.e.thepokemons.model.response.GetPokemonsResponse
import retrofit2.Call
import retrofit2.http.GET

interface RemoteApiService {

    @GET("pokedex.json")
    fun getListPokemon(): Call<GetPokemonsResponse>

    @GET("/pokemon/id")
    fun getPokemonById(pokemonId: Int): Pokemon

}