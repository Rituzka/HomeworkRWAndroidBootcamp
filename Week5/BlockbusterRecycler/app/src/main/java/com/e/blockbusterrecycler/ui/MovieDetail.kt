package com.e.blockbusterrecycler.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.model.ModelMovies
import kotlinx.android.synthetic.main.movie_detail.*

class MovieDetail : AppCompatActivity() {
    private lateinit var list: ModelMovies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_detail)

        list = intent.getParcelableExtra(MainActivity.KEY_LIST)as ModelMovies
        image_detail.setImageResource(list.detail)
        lbl_movie_title.text = list.title
        lbl_summary.setText(list.summary)
        lbl_director.text = list.director
        lbl_stars.setText(list.stars)
    }

}