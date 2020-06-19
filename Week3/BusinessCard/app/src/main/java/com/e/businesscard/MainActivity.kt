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

        //click listener to the JoinUs button
        btnJoinUs.setOnClickListener {

            //animation to Android logo, it rotates 360º
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            logoAndroid.startAnimation(animation)
            //animation zoom to slogan "Always in Motion"
            val animation2 = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            lblAlways.startAnimation(animation2)
            //animation zoom_out to label Name of the card, to give it some movement
            val animation3 = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            lblName.startAnimation(animation3)

        }
    }
    //inflate view of menu in the action bar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
     //item telephone added to the menu, it shows a dialog phone info
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        if(item.itemId == R.id.actionCall ) {
            showInfoCall()
        }else if(item.itemId == R.id.actionShare) {
            showInfoShare()
        }
        return true
    }

    private fun showInfoShare() {
        val dialogshare = getString(R.string.share_image)

        val builder = AlertDialog.Builder(this)
        builder.setTitle(dialogshare)
        builder.create().show()
    }

    //function to show the information of phone number and custom service attention schedule
    private fun showInfoCall() {
        val dialogPhone = getString(R.string.call)
        val dialogSchedule = getString(R.string.schedule)

        val builder = AlertDialog.Builder(this)
        builder.setTitle(dialogPhone)
        builder.setMessage(dialogSchedule)
        builder.create().show()
    }

}