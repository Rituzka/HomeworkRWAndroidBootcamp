package com.e.thepokemons.repository

import com.e.thepokemons.App
import com.e.thepokemons.db.PokemonDao
import com.e.thepokemons.model.Pokemon

class PokemonRepo {
    private val pokemonDao: PokemonDao = App.pokemonDb.pokemonDao()

    suspend fun getAllPokemons(): List<Pokemon> = pokemonDao.fetchPokemons()
    suspend fun storePokemons(pokemons: List<Pokemon>)= pokemonDao.storePokemons(pokemons)
    suspend fun storePokemonsIfNotEmpty(pokemons: List<Pokemon>){
        if(getAllPokemons().count() < 1) storePokemons(pokemons)
    }
}