package com.example.pcst.Models

class HomeModel {
    private var itemImage : Int? = null
    private var itemName : String = ""
    private var itemPrice : String = ""

    constructor()
    constructor(itemImage: Int?, itemName: String, itemPrice: String) {
        this.itemImage = itemImage
        this.itemName = itemName
        this.itemPrice = itemPrice
    }

    fun getItemImage() : Int? {
        return itemImage
    }

    fun getItemName() : String {
        return itemName
    }

    fun getItemPrice() : String {
        return itemPrice
    }

    fun setItemImage(itemImage: Int?){
        this.itemImage = itemImage
    }

    fun setItemName(itemName: String){
        this.itemName = itemName
    }

    fun setItemPrice(itemPrice: String){
        this.itemPrice = itemPrice
    }
}