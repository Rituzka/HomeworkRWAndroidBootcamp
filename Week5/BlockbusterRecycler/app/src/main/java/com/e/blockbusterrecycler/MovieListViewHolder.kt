package com.e.blockbusterrecycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MovieListViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val movieImage = itemView.findViewById<ImageView>(R.id.imageMovie)
    private val movieTitle = itemView.findViewById<TextView>(R.id.movieTitle)

    fun bindView(image: ModelMovies){
        movieImage.setImageResource(image.poster)
        movieTitle.text = image.title
    }
}