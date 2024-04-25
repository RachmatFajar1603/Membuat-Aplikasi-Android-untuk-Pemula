//package com.dicoding.project.Activities.adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.dicoding.project.Activities.TransportItem
//import com.dicoding.project.R
//import com.dicoding.project.databinding.ItemReviewBinding
//
//class TransportAdapter(private val listTransport: ArrayList<TransportItem>) : RecyclerView.Adapter<TransportAdapter.ListViewHolder>() {
//
////    private lateinit var onItemClickCallback: OnItemClickCallback
////
////    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
////        this.onItemClickCallback = onItemClickCallback
////    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
//        val binding = ItemReviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return ListViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//        val review = getItem(position)
//        holder.bind(review)
//    }
//
//    class ListViewHolder(val binding: ItemReviewBinding) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(review: listTransport){
//            binding.tvItem.text = "${review.review}\n- ${review.name}"
//        }
//    }
//
//
//
//}
//
