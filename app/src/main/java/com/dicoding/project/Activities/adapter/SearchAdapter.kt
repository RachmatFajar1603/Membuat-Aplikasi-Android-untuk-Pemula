package com.dicoding.project.Activities.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.project.Activities.data.response.ItemsItem
import com.dicoding.project.databinding.ItemReviewBinding

class SearchAdapter(private val listUser: List<ItemsItem>) : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    class ViewHolder(var binding: ItemReviewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemReviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = listUser[position]

        with(holder.binding){
            Glide.with(root.context)
                .load(user.avatarUrl)
                .circleCrop()
                .into(imgUser)
            nameUser.text= user.login
            urlUser.text = user.htmlUrl
            root.setOnClickListener { onItemClickCallback.onItemClicked(listUser[position]) }
        }
    }

    override fun getItemCount(): Int =listUser.size

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ItemsItem)
    }
}