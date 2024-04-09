package com.example.pcst.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pcst.Models.GamesModel
import com.example.pcst.databinding.GamesRvItemBinding


class GamesAdapter(
    val context : Context,
    val listArray: ArrayList<GamesModel>
) : RecyclerView.Adapter<GamesAdapter.GamesViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GamesAdapter.GamesViewHolder {
        val binding = GamesRvItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return GamesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GamesAdapter.GamesViewHolder, position: Int) {

        val listModel : GamesModel = listArray[position]

        holder.itemName.text = listModel.getItemName()
        holder.itemPrice.text = listModel.getItemDifficulty()
        listModel.getItemImage()?.let { holder.itemImage.setImageResource(it) }


    }

    override fun getItemCount(): Int {
        return listArray.size
    }

    class GamesViewHolder(binding: GamesRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val itemImage = binding.gamesItemImage
        val itemName = binding.gamesItemName
        val itemPrice =binding.gamesItemDifficulty
    }
}