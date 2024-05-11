package com.example.pcst.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
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

        holder.item.setOnClickListener {
            val intent = Intent(context, GameTheory::class.java)
            for (item in listArray) {
                if (holder.itemName.text == item.getItemName())
                {
                    intent.putExtra("gameTheoryTitle",item.getItemTheoryTitle())
                    intent.putExtra("gameTheoryArticle", item.getItemTheoryArticle())
                    intent.putExtra("gameTaskTitle",item.getItemTaskTitle())
                    intent.putExtra("gameTaskText", item.getItemTaskText())
                    intent.putExtra("gameTaskTip", item.getItemTaskTip())
                    intent.putExtra("gameTaskCorrect", item.getItemTaskCorrect())
                    intent.putExtra("gameTestText", item.getItemTestText())
                    intent.putExtra("gameTestCorrect", item.getItemTestCorrect())
                    intent.putExtra("gameTestAnswer_1", item.getItemTestAnswer_1())
                    intent.putExtra("gameTestAnswer_2", item.getItemTestAnswer_2())
                    intent.putExtra("gameTestAnswer_3", item.getItemTestAnswer_3())
                    intent.putExtra("gameTestAnswer_4", item.getItemTestAnswer_4())
                }
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listArray.size
    }


    class GamesViewHolder(binding: GamesRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val itemImage = binding.gamesItemImage
        val itemName = binding.gamesItemName
        val itemDifficulty =binding.gamesItemDifficulty

        val item = binding.root
    }

}