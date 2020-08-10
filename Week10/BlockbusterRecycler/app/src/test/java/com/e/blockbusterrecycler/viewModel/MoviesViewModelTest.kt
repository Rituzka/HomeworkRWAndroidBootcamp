package com.e.blockbusterrecycler.viewModel

import android.content.Context
import androidx.room.Room
import com.e.blockbusterrecycler.app.App
import com.e.blockbusterrecycler.model.MovieDAO
import com.e.blockbusterrecycler.model.MovieDatabase
import com.e.blockbusterrecycler.networking.MovieModelApi
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*
import java.io.IOException

class MoviesViewModelTest {

        private lateinit var movieDao: MovieDAO
        private lateinit var db: MovieDatabase
        lateinit var context: Context

        @Before
        fun createDb() {
            db = Room.inMemoryDatabaseBuilder(
                context, MovieDatabase::class.java
            ).build()
            movieDao = db.movieDao()
        }

        @After
        @Throws(IOException::class)
        fun closeDb() {
            db.close()
        }

        @Test
        @Throws(Exception::class)
        suspend fun writeUserAndReadInList() {
            val movieTest = MovieModelApi(
                "parcel",
                1999,
                "12/12/1999",
                "James Test",
                "varios actors",
                "http://www.posters.com",
                "idTest",
                "Comedy",
                true
            )

            movieDao.insertMovie(movieTest)
            val byTitle = movieDao.findMovieById("idTest")
            assertEquals(byTitle.title, movieTest.title)
        }
    }




