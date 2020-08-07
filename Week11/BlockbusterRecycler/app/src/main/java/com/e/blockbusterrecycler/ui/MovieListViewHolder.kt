package com.e.blockbusterrecycler.ui

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.model.ModelMovies
import kotlinx.android.synthetic.main.movie_list_view_holder.view.*


class MovieListViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val movieImage = itemView.imageMovie
    private val movieTitle = itemView.movieTitle

    fun bindView(image: ModelMovies){
        movieImage.setImageResource(image.poster)
        movieTitle.text = image.title
    }
}