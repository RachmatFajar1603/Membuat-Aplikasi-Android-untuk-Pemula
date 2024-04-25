package com.dicoding.project.Activities.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.project.Activities.adapter.ReviewAdapter
import com.dicoding.project.Activities.data.response.ItemsItem
import com.dicoding.project.Activities.model.MainViewModel
import com.dicoding.project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    override fun OnCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val mainViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            MainViewModel::class.java
        )

        binding.rvUserList.layoutManager = LinearLayoutManager(this)
        binding.rvUserList.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager(this).orientation))

        mainViewModel.user.observe(this){
            consumerUser -> setUserData()
        }

        mainViewModel.isLoading.observe(this){
            showLoading(it)
        }
    }

    private fun setUserData(users: List<ItemsItem>){
        val adapter = ReviewAdapter { selectedUser ->
            startActivity(Intent(this@MainActivity, DetailActivity::class.java).putExtra("ID_USER",selectedUser.login))
        }

        adapter.submitList(users)
        binding.rvUserList.adapter = adapter
    }

    private fun showLoading(isLoading: Boolean){
        binding.progressBar.visibility = if(isLoading) View.VISIBLE else View.GONE
    }

}