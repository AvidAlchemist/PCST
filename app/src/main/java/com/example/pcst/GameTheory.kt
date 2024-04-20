package com.example.pcst


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pcst.databinding.ActivityGameTheoryBinding


class GameTheory : AppCompatActivity() {

    private lateinit var binding : ActivityGameTheoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameTheoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gameTheoryTitle = intent.getStringExtra("gameTheoryTitle")
        val gameTheoryArticle = intent.getStringExtra("gameTheoryArticle")
        val gameTaskTitle = intent.getStringExtra("gameTaskTitle")
        val gameTaskText = intent.getStringExtra("gameTaskText")
        val gameTaskTip = intent.getStringExtra("gameTaskTip")
        val gameTaskCorrect = intent.getStringExtra("gameTaskCorrect")
        val gameTestText = intent.getStringExtra("gameTestText")
        val gameTestCorrect = intent.getStringExtra("gameTestCorrect")
        val gameTestAnswer_1 = intent.getStringExtra("gameTestAnswer_1")
        val gameTestAnswer_2 = intent.getStringExtra("gameTestAnswer_2")
        val gameTestAnswer_3 = intent.getStringExtra("gameTestAnswer_3")
        val gameTestAnswer_4 = intent.getStringExtra("gameTestAnswer_4")

        binding.theoryTitleText.text = gameTheoryTitle
        binding.theoryArticleText.text = gameTheoryArticle

        val gameTheoryButton : Button = findViewById(R.id.theory_button)
        gameTheoryButton.setOnClickListener {
            val intent = Intent(this, GameTask::class.java)

            intent.putExtra("gameTaskTitle",gameTaskTitle)
            intent.putExtra("gameTaskText", gameTaskText)
            intent.putExtra("gameTaskTip", gameTaskTip)
            intent.putExtra("gameTaskCorrect",gameTaskCorrect)
            intent.putExtra("gameTestText", gameTestText)
            intent.putExtra("gameTestCorrect",gameTestCorrect)
            intent.putExtra("gameTestAnswer_1", gameTestAnswer_1)
            intent.putExtra("gameTestAnswer_2",gameTestAnswer_2)
            intent.putExtra("gameTestAnswer_3", gameTestAnswer_3)
            intent.putExtra("gameTestAnswer_4", gameTestAnswer_4)

            startActivity(intent)
            finish()
        }

    }
}