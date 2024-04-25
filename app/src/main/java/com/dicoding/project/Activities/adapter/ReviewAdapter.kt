//package com.dicoding.project.Activities.adapter
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.dicoding.project.Activities.data.response.ItemsItem
//import com.dicoding.project.databinding.ItemReviewBinding
//
//class ReviewAdapter(private val onItemClick: (ItemsItem) -> Unit): androidx.recyclerview.widget.ListAdapter<ItemsItem, ReviewAdapter.MyViewHolder>(DIFF_CALLBACK) {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewAdapter.MyViewHolder {
//        val binding = ItemReviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return MyViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: ReviewAdapter.MyViewHolder, position: Int) {
//        holder.bind(getItem(position))
//
//        holder.itemView.setOnClickListener {
//            onItemClick(getItem(holder.adapterPosition))
//        }
//    }
//
//    class MyViewHolder(private val binding: ItemReviewBinding) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(user: ItemsItem) {
//            with(binding) {
//                binding.nameReview.text = user.login
//                Glide.with(binding.root).load(user.avatarUrl).into(binding.imageReview)
//            }
//        }
//    }
//
//    companion object {
//        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ItemsItem>() {
//            override fun areItemsTheSame(oldItem: ItemsItem, newItem: ItemsItem): Boolean {
//                return oldItem == newItem
//            }
//            override fun areContentsTheSame(oldItem: ItemsItem, newItem: ItemsItem): Boolean {
//                return oldItem == newItem
//            }
//        }
//    }
//}