package com.e.thepokemons.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.e.thepokemons.model.Pokemon


@Database(entities = [Pokemon::class], version = 1, exportSchema = false)
abstract class PokemonDatabase : RoomDatabase() {
    abstract fun pokemonDao(): PokemonDao
}

const val DATABASE_NAME = "pokemon_database"