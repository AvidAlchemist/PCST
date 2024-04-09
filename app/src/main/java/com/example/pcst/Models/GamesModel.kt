package com.example.pcst.Models

class GamesModel {
    private var itemImage : Int? = null
    private var itemName : String = ""
    private var itemDifficulty : String = ""

    constructor()
    constructor(itemImage: Int?, itemName: String, itemDifficulty: String) {
        this.itemImage = itemImage
        this.itemName = itemName
        this.itemDifficulty = itemDifficulty
    }

    fun getItemImage() : Int? {
        return itemImage
    }

    fun getItemName() : String {
        return itemName
    }

    fun getItemDifficulty() : String {
        return itemDifficulty
    }

    fun setItemImage(itemImage: Int?){
        this.itemImage = itemImage
    }

    fun setItemName(itemName: String){
        this.itemName = itemName
    }

    fun setItemDifficulty(itemDifficulty: String){
        this.itemDifficulty = itemDifficulty
    }
}