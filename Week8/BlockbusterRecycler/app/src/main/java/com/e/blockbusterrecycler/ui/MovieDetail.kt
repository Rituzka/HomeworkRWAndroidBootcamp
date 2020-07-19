package com.e.blockbusterrecycler.ui

import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.app.App
import com.e.blockbusterrecycler.model.Movie
import com.e.blockbusterrecycler.networking.MovieModelApi
import com.e.blockbusterrecycler.networking.NetworkStatusChecker
import kotlinx.android.synthetic.main.movie_detail.*

class MovieDetail : AppCompatActivity() {

    private lateinit var list: MovieModelApi
    private val remoteApi = App.remoteApi
    private val networkStatusChecker by lazy {
      NetworkStatusChecker(this.getSystemService(ConnectivityManager::class.java))
    }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.movie_detail)

            list = intent.getParcelableExtra(KEY_LIST)as MovieModelApi

            image_detail(list.poster)
            lbl_movie_title.text = list.title
            lbl_director.text = list.director
            lbl_stars.text = list.actors
        }
    }

}