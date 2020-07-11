package com.e.thepokemons.networking

import com.e.thepokemons.model.Pokemon
import retrofit2.http.GET

interface RemoteApiService {

    @GET("/pokemon/?offset=20&limit=20")
    fun getListPokemons(): List<Pokemon>

    @GET("/pokemon/id")
    fun getPokemonById(pokemonId: Int): Pokemon

}