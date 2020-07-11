package com.e.thepokemons.model

data class Pokemon(
    val id: Int? = 0,
    val name: String? = null,
    val image: String? = null,
    val type: List<String>? = null,
    val height: String? = null,
    val weight: String? = null,
    val weaknesses: List<String>
)