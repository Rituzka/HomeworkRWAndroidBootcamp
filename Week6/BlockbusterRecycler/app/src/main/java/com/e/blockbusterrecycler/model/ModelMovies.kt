package com.e.blockbusterrecycler.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class ModelMovies (
    @PrimaryKey val id: Int,
    val releaseDate: String,
    val title: String,
    val summary: Int,
    val poster:Int,
    val detail:Int,
    val director: String,
    val stars: Int
)


