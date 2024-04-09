package com.example.pcst.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pcst.Models.HomeModel
import com.example.pcst.databinding.HomeRvItemBinding

class HomeAdapter(
    val context : Context,
    val listArray: ArrayList<HomeModel>
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeAdapter.HomeViewHolder {
        val binding = HomeRvItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeAdapter.HomeViewHolder, position: Int) {

        val listModel : HomeModel = listArray[position]

        holder.itemName.text = listModel.getItemName()
        holder.itemPrice.text = listModel.getItemPrice()
        listModel.getItemImage()?.let { holder.itemImage.setImageResource(it) }


    }

    override fun getItemCount(): Int {
        return listArray.size
    }

    class HomeViewHolder(binding : HomeRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val itemImage = binding.homeItemImage
        val itemName = binding.homeItemName
        val itemPrice =binding.homeItemPrice
    }
}