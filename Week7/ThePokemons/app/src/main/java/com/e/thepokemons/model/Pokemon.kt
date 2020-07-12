package com.e.thepokemons.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity
@Serializable
class Pokemon(
    @PrimaryKey
    val id: Int? = 0,
    val name: String? = null,
    val image: String? = null,
    val type: List<String>? = null,
    val height: String? = null,
    val weight: String? = null,
    val weaknesses: List<String>
)