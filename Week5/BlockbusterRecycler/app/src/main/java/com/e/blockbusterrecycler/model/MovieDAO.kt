package com.e.blockbusterrecycler.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.e.blockbusterrecycler.model.ModelMovies

@Dao
interface MovieDAO {

    @Insert
    fun insert(movie: ModelMovies)

    @Delete
    fun clearMovies(vararg movie: ModelMovies)

    @Query("SELECT * FROM movies ORDER BY title ASC")
    fun getAllMovies(): LiveData<List<ModelMovies>>
}