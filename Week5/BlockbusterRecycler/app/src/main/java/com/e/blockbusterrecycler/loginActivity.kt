package com.e.blockbusterrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.movie_list_view_holder.*

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val imageLogo = imageMovie
        //imageLogo.setImageResource(R.drawable.logo_movies)
    }
}