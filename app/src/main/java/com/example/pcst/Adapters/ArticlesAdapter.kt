package com.example.pcst.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pcst.Models.ArticlesModel
import com.example.pcst.databinding.ArticlesRvItemBinding


class ArticlesAdapter(
    val context : Context,
    val listArray: ArrayList<ArticlesModel>
) : RecyclerView.Adapter<ArticlesAdapter.ArticlesViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticlesAdapter.ArticlesViewHolder {
        val binding = ArticlesRvItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ArticlesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticlesAdapter.ArticlesViewHolder, position: Int) {

        val listModel : ArticlesModel = listArray[position]

        holder.itemName.text = listModel.getItemName()
        holder.itemTime.text = listModel.getItemTime()
        listModel.getItemImage()?.let { holder.itemImage.setImageResource(it) }


    }

    override fun getItemCount(): Int {
        return listArray.size
    }

    class ArticlesViewHolder(binding: ArticlesRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val itemImage = binding.articlesItemImage
        val itemName = binding.articlesItemName
        val itemTime =binding.articlesItemTime
    }
}