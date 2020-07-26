package com.e.blockbusterrecycler.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.e.blockbusterrecycler.networking.MovieModelApi
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.movie_list_view_holder.view.*


class MovieListViewHolder(override val containerView: View): RecyclerView.ViewHolder(containerView),
LayoutContainer{

        fun bindView(data: MovieModelApi) = with(containerView) {
            Glide.with(this).load(data.poster).into(imageMovie)
            movieTitle.text = data.title
        }
}