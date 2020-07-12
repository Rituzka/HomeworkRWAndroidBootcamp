package com.e.thepokemons.ui.activities

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.e.thepokemons.App
import com.e.thepokemons.R
import com.e.thepokemons.common.ItemDecoration
import com.e.thepokemons.model.Pokemon
import com.e.thepokemons.model.response.Success
import com.e.thepokemons.networking.NetworkStatusChecker
import com.e.thepokemons.ui.adapter.PokemonAdapter
import kotlinx.android.synthetic.main.activity_pokemon_list.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class PokemonListActivity : AppCompatActivity() {

    private val adapter by lazy { PokemonAdapter() }
    private val remoteApi = App.remoteApi
    private val networkStatusChecker by lazy {
        NetworkStatusChecker(this.getSystemService(ConnectivityManager::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_list)
         initUI()
    }

    private fun initUI() {
        pokemon_recyclerview.setHasFixedSize(true)
        pokemon_recyclerview.layoutManager = GridLayoutManager(this, 2)
        val itemDecoration = ItemDecoration(this, R.dimen.fourdp)
        pokemon_recyclerview.addItemDecoration(itemDecoration)
        pokemon_recyclerview.adapter = adapter
        getAllPokemons()
    }

    private fun getAllPokemons() {
        networkStatusChecker.performIfConnectedToInternet {
            GlobalScope.launch(Dispatchers.Main) {
            val result = remoteApi.getPokemons()
                if (result is Success) {
                    onDataReceived(result.data)
                } else {
                    onGetDataFailed()
                }
            }
        }
    }
        private fun onGetDataFailed() {
            this.toast("Failed to fetch pokemons!")
        }

        private fun onDataReceived(pokemons: List<Pokemon>) {
            adapter.setData(pokemons)
        }

        fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(this, message, length).show()
        }
}