package com.e.thepokemons.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.e.thepokemons.model.Pokemon
import kotlinx.android.synthetic.main.pokemon_list_item.view.*

class PokemonViewModel(itemView: View) : RecyclerView.ViewHolder(itemView) {

     fun bindData(pokemon: Pokemon)  {
          itemView.pokemon_name.text = pokemon.name
          Glide.with(itemView.pokemon_image.context)
               .load(pokemon.image)
               .into(itemView.pokemon_image)
     }
}

