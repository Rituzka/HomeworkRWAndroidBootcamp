package com.e.thepokemons.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.e.thepokemons.model.Pokemon

@Dao
interface PokemonDao {
    @Insert(onConflict= OnConflictStrategy.REPLACE)
    fun storePokemons(pokemons: List<Pokemon>)

    @Query("SELECT * FROM Pokemon")
    fun fetchPokemons(): List<Pokemon>

    @Query("SELECT * FROM Pokemon WHERE id=:pokemonId")
    fun fetchPokemonById(pokemonId: Int?): Pokemon

}