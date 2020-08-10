package com.e.blockbusterrecycler.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.networking.MovieModelApi
import kotlinx.android.synthetic.main.movie_detail.*

class MovieDetail : AppCompatActivity() {

    private lateinit var list: MovieModelApi

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.movie_detail)

            list = intent.getParcelableExtra(KEY_LIST)as MovieModelApi

            lbl_movie_title.text = list.title
            lbl_director.text = list.director
            lbl_stars.text = list.actors
            Glide.with(this).load(list.poster).into(image_detail)
        }
    }

