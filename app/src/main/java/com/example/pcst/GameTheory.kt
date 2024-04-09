package com.example.pcst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GameTheory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_theory)

      /*  val transmittedTitle = intent.getStringExtra(TRANSMITTED_TITLE)

        val textViewTitle : TextView = findViewById(R.id.theory_title_text)
        textViewTitle.text = transmittedTitle*/
    }

    companion object {
        const val TRANSMITTED_TITLE = "transmittedTitle"
    }
}