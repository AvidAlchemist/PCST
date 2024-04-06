package com.example.pcst.ui.articles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ArticlesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Здесь будет список статей"
    }
    val text: LiveData<String> = _text
}