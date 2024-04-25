package com.dicoding.project.Activities.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.project.Activities.TransportItem
import com.dicoding.project.R
import com.dicoding.project.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val transport: TransportItem? = intent.getParcelableExtra("Transport_Data")

        if (transport != null) {
            binding.titleDetail.text = transport.name
            binding.deskripsiDetail.text = transport.description
            binding.imageDetail.setImageResource(transport.photo)
            binding.isiDetail.text= transport.detail
        }

        val btnMoveActivity: Button = findViewById(R.id.imageViewButton)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.imageViewButton -> {
                val moveIntent = Intent(this@DetailActivity, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
