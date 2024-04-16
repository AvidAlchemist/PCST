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
            when (holder.itemName.text)
            {
                context.getString(R.string.rsaFactsTitle) -> {
                    intent.putExtra("articlesTitleImage", R.drawable.rsa_authors)
                    intent.putExtra("articlesText", context.getString(R.string.rsaFactsText))
                }
                context.getString(R.string.cryptanalysisTitle) -> {
                    intent.putExtra("articlesTitleImage", R.drawable.cryptanalysis)
                    intent.putExtra("articlesText", context.getString(R.string.cryptanalysisText))
                }
                context.getString(R.string.shannonTitle) -> {
                    intent.putExtra("articlesTitleImage", R.drawable.shannon)
                    intent.putExtra("articlesText",context.getString(R.string.shannonText))
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