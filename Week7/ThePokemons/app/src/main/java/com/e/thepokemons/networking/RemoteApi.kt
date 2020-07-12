package com.e.thepokemons.networking

import com.e.thepokemons.model.Pokemon
import com.e.thepokemons.model.response.Failure
import com.e.thepokemons.model.response.GetPokemonsResponse
import com.e.thepokemons.model.response.Result
import com.e.thepokemons.model.response.Success
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val BASE_URL = "https://raw.githubusercontent.com/Biuni/PokemonGO-Pokedex/master/"

class RemoteApi(private val apiService: RemoteApiService) {

    fun getPokemons(onPokemonsReceived: (Result<List<Pokemon>>) -> Unit) {
        apiService.getListPokemon().enqueue(object : Callback<GetPokemonsResponse> {
            override fun onFailure(call: Call<GetPokemonsResponse>, error: Throwable) {
                onPokemonsReceived(Failure(error))
            }

            override fun onResponse(
                call: Call<GetPokemonsResponse>,
                response: Response<GetPokemonsResponse>
            ) {
                val data = response.body()

                 if (data == null) {
                    onPokemonsReceived(Failure(NullPointerException("No data available")))
                }
            }
        })
    }
}

