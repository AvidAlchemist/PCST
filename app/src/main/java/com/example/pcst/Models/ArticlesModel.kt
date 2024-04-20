package com.example.pcst.Models

class ArticlesModel {
    private var itemImage : Int? = null
    private var itemName : String = ""
    private var itemTime : String = ""
    private var itemTitleImage : Int? = null
    private var itemText : String = ""
    private var itemTestText : String = ""
    private var itemTestCorrect : String = ""
    private var itemTestAnswer_1 : String = ""
    private var itemTestAnswer_2 : String = ""
    private var itemTestAnswer_3 : String = ""
    private var itemTestAnswer_4 : String = ""

    constructor()
    constructor(itemImage: Int?, itemName: String, itemTime: String,
                itemTitleImage : Int?, itemText : String, itemTestText : String,
                itemTestCorrect : String, itemTestAnswer_1 : String,
                itemTestAnswer_2 : String, itemTestAnswer_3 : String,
                itemTestAnswer_4 : String) {
        this.itemImage = itemImage
        this.itemName = itemName
        this.itemTime = itemTime
        this.itemTitleImage = itemTitleImage
        this.itemText = itemText
        this.itemTestText = itemTestText
        this.itemTestCorrect = itemTestCorrect
        this.itemTestAnswer_1 = itemTestAnswer_1
        this.itemTestAnswer_2 = itemTestAnswer_2
        this.itemTestAnswer_3 = itemTestAnswer_3
        this.itemTestAnswer_4 = itemTestAnswer_4
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

    fun getItemTitleImage() : Int? {
        return itemTitleImage
    }

    fun getItemText() : String {
        return itemText
    }

    fun getItemTestText() : String {
        return itemTestText
    }

    fun getItemTestCorrect() : String {
        return itemTestCorrect
    }

    fun getItemTestAnswer_1() : String {
        return itemTestAnswer_1
    }

    fun getItemTestAnswer_2() : String {
        return itemTestAnswer_2
    }

    fun getItemTestAnswer_3() : String {
        return itemTestAnswer_3
    }

    fun getItemTestAnswer_4() : String {
        return itemTestAnswer_4
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