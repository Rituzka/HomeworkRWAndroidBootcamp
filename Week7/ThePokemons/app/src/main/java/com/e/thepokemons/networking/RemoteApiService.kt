package com.e.thepokemons.networking


import com.e.thepokemons.model.Pokemon
import retrofit2.http.GET

interface RemoteApiService {

    @GET("pokedex.json")
    fun getListPokemon(): List<Pokemon>

    @GET("/pokemon/id")
    fun getPokemonById(pokemonId: Int): Pokemon

}