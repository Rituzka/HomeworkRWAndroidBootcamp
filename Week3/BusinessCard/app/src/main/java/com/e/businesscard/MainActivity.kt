package com.e.businesscard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnJoinUs.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            logoAndroid.startAnimation(animation)

            val animation2 = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            logoText.startAnimation(animation2)

            val animation3 = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            logoText.startAnimation(animation3)

        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        if(item.itemId == R.id.actionCall ) {
            showInfo()
        }
        return true
    }

    private fun showInfo() {
        val dialogPhone = getString(R.string.call)
        val dialogSchedule = getString(R.string.schedule)

        val builder = AlertDialog.Builder(this)
        builder.setTitle(dialogPhone)
        builder.setMessage(dialogSchedule)
        builder.create().show()
    }

}