package com.e.thepokemons

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.e.thepokemons.db.DATABASE_NAME
import com.e.thepokemons.db.PokemonDatabase
import com.e.thepokemons.networking.RemoteApi
import com.e.thepokemons.networking.buildApiService

private const val KEY_PREFERENCES = "pokemon_preferences"
private const val KEY_TOKEN = "token"

class App: Application() {

    companion object {

        private lateinit var instance: App
        lateinit var pokemonDb: PokemonDatabase

        private val preferences by lazy {
            instance.getSharedPreferences(KEY_PREFERENCES, Context.MODE_PRIVATE)
        }

        fun saveToken(token: String) {
            preferences.edit()
                .putString(KEY_TOKEN, token)
                .apply()
        }

        fun getToken() = preferences.getString(KEY_TOKEN, "") ?: ""

        private val apiService by lazy { buildApiService() }
        val remoteApi by lazy { RemoteApi(apiService) }

    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        initRoom()
    }

    private fun initRoom() {
        pokemonDb = Room.databaseBuilder(this, PokemonDatabase::class.java, DATABASE_NAME)
            .build()
    }
}