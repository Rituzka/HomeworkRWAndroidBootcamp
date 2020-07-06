package com.e.blockbusterrecycler.model


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ModelMovie (
    @PrimaryKey var id: Int? = null,
    var releaseDate: String? = null,
    var title: String? = null,
    var summary: String? = null,
    val poster:Int,
    val detail:Int,
    var director: String? = null,
    var stars: String? = null
)

