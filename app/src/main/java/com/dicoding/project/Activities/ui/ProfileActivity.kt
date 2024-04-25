package com.dicoding.project.Activities.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.project.R

class ProfileActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnMoveActivity: Button = findViewById(R.id.goBack)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.goBack -> {
                val moveIntent = Intent(this@ProfileActivity, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}