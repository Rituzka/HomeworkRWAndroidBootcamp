package com.e.blockbusterrecycler

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import kotlinx.android.synthetic.main.movie_detail.*

class MovieDetail : AppCompatActivity() {
    private lateinit var list: ModelMovies

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        getSharedPreferences(getString(R.string.username), Context.MODE_PRIVATE)
            .edit()
            .clear()
            .apply()
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
       return true
    }

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