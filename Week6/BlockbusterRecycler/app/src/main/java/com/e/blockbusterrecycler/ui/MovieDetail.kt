package com.e.blockbusterrecycler.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.model.ModelMovie
import com.e.blockbusterrecycler.repository.MovieRepository
import kotlinx.android.synthetic.main.movie_detail.*

private const val MOVIE_ID_KEY = "movie_id"

fun startMovieDetailsActivity(from: Context, movieId: Int?) =
    from.startActivity(Intent(from, MovieDetail::class.java).apply {
        putExtra(MOVIE_ID_KEY, movieId)
    })


class MovieDetail : AppCompatActivity() {

    private val movieId by lazy { intent.getIntExtra(MOVIE_ID_KEY, -1) }
    private val repository by lazy { MovieRepository() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_detail)

        val movie = repository.getMovieById(movieId)
        displayMovieDetails(movie)
    }
        private fun displayMovieDetails(movie: ModelMovie) {
            image_detail.setImageResource(movie.detail)
            lbl_movie_title.text = movie.title
            lbl_summary.text = movie.summary
            lbl_director.text = movie.director
            lbl_stars.text = movie.stars
        }
    }
