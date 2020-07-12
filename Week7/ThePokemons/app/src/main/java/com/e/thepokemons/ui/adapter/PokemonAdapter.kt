package com.e.thepokemons.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.e.thepokemons.R
import com.e.thepokemons.model.Pokemon


class PokemonAdapter()
    : RecyclerView.Adapter<PokemonViewModel>() {

private val pokemonList = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewModel {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pokemon_list_item, parent, false)
        return PokemonViewModel(view)

    }
    override fun getItemCount(): Int {
       return pokemonList.size
    }

    override fun onBindViewHolder(holder: PokemonViewModel, position: Int) {
        Glide.with(holder.pokemonImage.getContext())
            .load(pokemonList[position].image)
            .into(holder.pokemonImage)
        holder.pokemonName.text = pokemonList[position].name

    }

    fun setData(data: List<Pokemon>) {
        this.pokemonList.clear()
        this.pokemonList.addAll(data)
        notifyDataSetChanged()
    }

}