package com.e.blockbusterrecycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_login.*


class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()

          if(isUsernameValid(user) && isPasswordValid(pass))
              goToListMovies()
          else makeText(this, "Login error, try again", LENGTH_LONG).show()
        }
    }

    private fun goToListMovies() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun isPasswordValid(password: String): Boolean {
        return password.length > 4 && password.isNotEmpty()
    }

    private fun isUsernameValid(username: String): Boolean {
        return username.length > 1 && username.isNotEmpty()
    }
}