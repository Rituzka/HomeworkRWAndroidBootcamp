package com.e.thepokemons.networking

import com.e.thepokemons.model.Pokemon
import com.e.thepokemons.model.response.Failure
import com.e.thepokemons.model.response.Result
import com.e.thepokemons.model.response.Success


const val BASE_URL = "https://raw.githubusercontent.com/Biuni/PokemonGO-Pokedex/master"

class RemoteApi(private val apiService: RemoteApiService) {

    suspend fun getPokemons(): Result<List<Pokemon>> = try {
        val data = apiService.getListPokemon()
        Success(data.pokemons)

    }catch (error: Throwable){
        Failure(error)
    }
}

