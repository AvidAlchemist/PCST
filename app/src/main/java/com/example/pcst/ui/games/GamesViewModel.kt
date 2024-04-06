package com.example.pcst.ui.games

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GamesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Здесь будет список мини-игр"
    }
    val text: LiveData<String> = _text
}