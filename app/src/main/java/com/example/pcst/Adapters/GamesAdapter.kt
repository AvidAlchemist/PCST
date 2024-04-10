package com.example.pcst.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.pcst.GameTheory
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
        holder.itemDifficulty.text = listModel.getItemDifficulty()
        listModel.getItemImage()?.let { holder.itemImage.setImageResource(it) }
       holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, GameTheory::class.java) )
        }

    }

    override fun getItemCount(): Int {
        return listArray.size
    }


    class GamesViewHolder(binding: GamesRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val itemImage = binding.gamesItemImage
        val itemName = binding.gamesItemName
        val itemDifficulty =binding.gamesItemDifficulty
    }

}