package com.example.pcst.Models

class ArticlesModel {
    private var itemImage : Int? = null
    private var itemName : String = ""
    private var itemTime : String = ""

    constructor()
    constructor(itemImage: Int?, itemName: String, itemTime: String) {
        this.itemImage = itemImage
        this.itemName = itemName
        this.itemTime = itemTime
    }

    fun getItemImage() : Int? {
        return itemImage
    }

    fun getItemName() : String {
        return itemName
    }

    fun getItemTime() : String {
        return itemTime
    }

    fun setItemImage(itemImage: Int?){
        this.itemImage = itemImage
    }

    fun setItemName(itemName: String){
        this.itemName = itemName
    }

    fun setItemTime(itemTime: String){
        this.itemTime = itemTime
    }
}