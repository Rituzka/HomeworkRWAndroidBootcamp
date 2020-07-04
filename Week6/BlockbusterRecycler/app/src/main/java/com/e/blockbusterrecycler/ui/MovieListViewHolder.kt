package com.e.blockbusterrecycler.ui

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.model.ModelMovie


class MovieListViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val movieImage = itemView.findViewById<ImageView>(R.id.imageMovie)
    private val movieTitle = itemView.findViewById<TextView>(R.id.movieTitle)

    fun bindView(image: ModelMovie){
        movieImage.setImageResource(image.poster)
        movieTitle.text = image.title
    }
}