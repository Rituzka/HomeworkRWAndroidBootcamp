package com.e.blockbusterrecycler

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

      //button login, after validation saves username and go to main activity
        btnLogin.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()

          if(isUsernameValid(user) && isPasswordValid(pass)) {
              saveLoginSharedPrefs(user)
              goToListMovies()
          } else makeText(this, "Login error, try again", LENGTH_LONG).show()
        }
    }
   //save username in sharedPreferences
    private fun saveLoginSharedPrefs(username: String) {
        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
        with (sharedPref.edit()) {
            putString(getString(R.string.username), username)
            apply()
        }
    }

    //validate password
    private fun isPasswordValid(password: String): Boolean {
        return password.length > 4 && password.isNotEmpty()
    }
   //validate user
    private fun isUsernameValid(username: String): Boolean {
        return username.length > 1 && username.isNotEmpty()
    }
    //go to MainActivity, list of movies
    private fun goToListMovies() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}