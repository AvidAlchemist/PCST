package com.example.pcst.Models

class GamesModel {
    private var itemImage : Int? = null
    private var itemName : String = ""
    private var itemDifficulty : String = ""
    private var itemTheoryTitle : String = ""
    private var itemTheoryArticle : String = ""
    private var itemTaskTitle : String = ""
    private var itemTaskText : String = ""
    private var itemTaskTip : String = ""
    private var itemTaskCorrect : String = ""
    private var itemTestText : String = ""
    private var itemTestCorrect : String = ""
    private var itemTestAnswer_1 : String = ""
    private var itemTestAnswer_2 : String = ""
    private var itemTestAnswer_3 : String = ""
    private var itemTestAnswer_4 : String = ""




    constructor()
    constructor(itemImage: Int?, itemName: String, itemDifficulty: String,
                itemTheoryTitle : String, itemTheoryArticle : String, itemTaskTitle : String,
                itemTaskText : String, itemTaskTip : String, itemTaskCorrect : String,
                itemTestText : String, itemTestCorrect : String, itemTestAnswer_1 : String,
                itemTestAnswer_2 : String, itemTestAnswer_3 : String, itemTestAnswer_4 :String) {
        this.itemImage = itemImage
        this.itemName = itemName
        this.itemDifficulty = itemDifficulty
        this.itemTheoryTitle = itemTheoryTitle
        this.itemTheoryArticle = itemTheoryArticle
        this.itemTaskTitle = itemTaskTitle
        this.itemTaskText = itemTaskText
        this.itemTaskTip = itemTaskTip
        this.itemTaskCorrect = itemTaskCorrect
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

    fun getItemDifficulty() : String {
        return itemDifficulty
    }

    fun getItemTheoryTitle() : String {
        return itemTheoryTitle
    }
    fun getItemTheoryArticle() : String {
        return itemTheoryArticle
    }
    fun getItemTaskTitle() : String {
        return itemTaskTitle
    }
    fun getItemTaskText() : String {
        return itemTaskText
    }
    fun getItemTaskTip() : String {
        return itemTaskTip
    }
    fun getItemTaskCorrect() : String {
        return itemTaskCorrect
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

    /*fun setItemImage(itemImage: Int?){
        this.itemImage = itemImage
    }

    fun setItemName(itemName: String){
        this.itemName = itemName
    }

    fun setItemDifficulty(itemDifficulty: String){
        this.itemDifficulty = itemDifficulty
    }*/


}