package com.e.thepokemons.model.response

import com.e.thepokemons.model.Pokemon
import kotlinx.serialization.Serializable

@Serializable
data class GetPokemonsResponse(val pokemons: List<Pokemon> = listOf()) {
}