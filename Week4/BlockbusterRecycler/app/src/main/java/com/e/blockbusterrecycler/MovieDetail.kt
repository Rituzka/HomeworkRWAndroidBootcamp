package com.e.blockbusterrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.movie_detail.*

class MovieDetail : AppCompatActivity() {
    lateinit var  list: ModelMovies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_detail)

        list = intent.getParcelableExtra(MainActivity.KEY_LIST)as ModelMovies
        image_detail.setImageResource(list.detail)
        lbl_movie_title.text = list.title
        lbl_summary.text = list.summary.toString()
        lbl_director.text = list.director
        lbl_stars.text = list.stars.toString()

    }
}