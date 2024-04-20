package com.example.pcst.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pcst.ArticlesTheory
import com.example.pcst.Models.ArticlesModel
import com.example.pcst.R
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

        holder.item.setOnClickListener {
            val intent = Intent(context, ArticlesTheory::class.java)
            for (item in listArray) {
                if (holder.itemName.text == item.getItemName())
                {
                    intent.putExtra("articlesTitleImage", item.getItemTitleImage())
                    intent.putExtra("articlesText", item.getItemText())
                    intent.putExtra("articlesTestText", item.getItemTestText())
                    intent.putExtra("articlesTestCorrect", item.getItemTestCorrect())
                    intent.putExtra("articlesTestAnswer_1", item.getItemTestAnswer_1())
                    intent.putExtra("articlesTestAnswer_2", item.getItemTestAnswer_2())
                    intent.putExtra("articlesTestAnswer_3", item.getItemTestAnswer_3())
                    intent.putExtra("articlesTestAnswer_4", item.getItemTestAnswer_4())

                }
            }
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return listArray.size
    }

    class ArticlesViewHolder(binding: ArticlesRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val itemImage = binding.articlesItemImage
        val itemName = binding.articlesItemName
        val itemTime =binding.articlesItemTime

        val item = binding.root
    }
}