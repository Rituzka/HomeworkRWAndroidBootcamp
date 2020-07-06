package com.e.blockbusterrecycler.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.extensions.CredentialsValidator
import com.e.blockbusterrecycler.extensions.onClick
import com.e.blockbusterrecycler.repository.UserRepository
import kotlinx.android.synthetic.main.activity_login.*

fun startLoginActivity(from: Context) = from.startActivity(Intent(from, LoginActivity::class.java))

class LoginActivity : AppCompatActivity() {

    private val credentialsValidator by lazy { CredentialsValidator() }
    private val userRepository by lazy { UserRepository() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        checkIfUserLoggedIn()
        btnLogin.onClick { checkCredentials() }
    }

    private fun checkIfUserLoggedIn() {
        if (userRepository.isUserLoggedIn()) {
            navigateToMovieScreen()
        }
    }

    private fun checkCredentials() {
        credentialsValidator.setCredentials(
            username.text.toString(),
            password.text.toString()
        )

        toggleUsernameState()
        togglePasswordState()

        if (credentialsValidator.areCredentialsValid()) {
            userRepository.setUserLoggedIn(true)
            navigateToMovieScreen()
        }
    }

    private fun toggleUsernameState() {
        if (!credentialsValidator.isUsernameValid()) {
            username.error = getString(R.string.username_error)
        } else {
            username.error = null
        }
    }

    private fun togglePasswordState() {
        if (!credentialsValidator.isPasswordValid()) {
            password.error = getString(R.string.password_error)
        } else {
            password.error = null
        }
    }

    private fun navigateToMovieScreen() {
        startMovieActivity(this)
        finish()
    }
}