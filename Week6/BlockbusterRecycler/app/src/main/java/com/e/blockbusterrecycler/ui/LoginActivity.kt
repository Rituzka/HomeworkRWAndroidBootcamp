package com.e.blockbusterrecycler.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.e.blockbusterrecycler.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)

    val sharedPref = getSharedPreferences(getString(R.string.saveData), Context.MODE_PRIVATE)
    val userLogged = sharedPref.getBoolean(getString(R.string.userlogged),false)

    if (userLogged) goToListMovies()


    //button login, after validation saves username and go to main activity
    btnLogin.setOnClickListener {
       if(isLoginValid()) {
           hideKeyboard()
         sharedPref.edit().putBoolean(getString(R.string.userlogged),true).apply()
           goToListMovies()

       } else
           hideKeyboard()
           showErrors()
    }
}
    //validate username and password
    private fun showErrors() {
        if (username.text.isEmpty())
            username.error = getString(R.string.usernameempty)
        if (username.length() < 2 && username.length() > 0)
            username.error = getString(R.string.usernameshort)
        if (password.text.isEmpty())
            password.error = getString(R.string.passwordempty)
        if (password.length() < 4 && password.length() > 0)
            password.error = getString(R.string.passwordShort)
    }
   //user an password validation
    private fun isLoginValid() =
        username.text.isNotEmpty()
                && username.length() > 1
                && password.text.isNotEmpty()
                && password.length() > 3


  //Hide Keyboard in Login screen when action is done
    private fun hideKeyboard() {
        val view: View? = this.currentFocus
        if (view != null) {
            val imm: InputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
    //function to access Main activity
    private fun goToListMovies() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}

