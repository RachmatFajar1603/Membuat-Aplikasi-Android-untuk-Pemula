package com.dicoding.project.Activities.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.dicoding.project.R

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        // Find the button by its ID
        val goButton: ImageView = findViewById(R.id.goBtn)

        // Set an OnClickListener on the button
        goButton.setOnClickListener {
            // Create an Intent to start MainActivity
            val intent = Intent(this, MainActivity::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }
    }
}