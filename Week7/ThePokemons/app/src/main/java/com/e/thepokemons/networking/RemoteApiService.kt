package com.e.thepokemons.networking

import android.database.Observable
import com.e.thepokemons.model.Pokedex
import com.e.thepokemons.model.Pokemon
import retrofit2.http.GET

interface RemoteApiService {

    @get: GET("pokedex.json")
    val listPokemon: Observable<Pokedex>

    @GET("/pokemon/id")
    fun getPokemonById(pokemonId: Int): Pokemon

}