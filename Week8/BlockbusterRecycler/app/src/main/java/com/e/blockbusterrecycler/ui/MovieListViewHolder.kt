package com.e.blockbusterrecycler.ui

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.model.Movie
import com.e.blockbusterrecycler.networking.MovieModelApi
import kotlinx.android.synthetic.main.movie_list_view_holder.view.*


class MovieListViewHolder(view: View): RecyclerView.ViewHolder(view) {

    fun bindView(data: MovieModelApi){

        movieImage.
        movieTitle.text = data.title
    }
}