package com.e.blockbusterrecycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MovieListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    var movieImage = itemView.findViewById<ImageView>(R.id.imageMovie)
    var movieTitle = itemView.findViewById<TextView>(R.id.movieTitle)

}