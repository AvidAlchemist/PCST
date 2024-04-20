package com.example.pcst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pcst.databinding.ActivityArticlesTheoryBinding
import com.example.pcst.databinding.ActivityGameTheoryBinding

class ArticlesTheory : AppCompatActivity() {
    private lateinit var binding : ActivityArticlesTheoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticlesTheoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val articlesTitleImage = intent.getIntExtra("articlesTitleImage", 0)
        val articlesText= intent.getStringExtra("articlesText")
        val articlesTestText= intent.getStringExtra("articlesTestText")
        val articlesTestCorrect= intent.getStringExtra("articlesTestCorrect")
        val articlesTestAnswer_1= intent.getStringExtra("articlesTestAnswer_1")
        val articlesTestAnswer_2= intent.getStringExtra("articlesTestAnswer_2")
        val articlesTestAnswer_3= intent.getStringExtra("articlesTestAnswer_3")
        val articlesTestAnswer_4= intent.getStringExtra("articlesTestAnswer_4")

        binding.articlesTitleImage.setImageResource(articlesTitleImage)
        binding.articlesText.text = articlesText

        val articlesContinueButton : Button = findViewById(R.id.articles_button)
        articlesContinueButton.setOnClickListener {
            val intent = Intent(this, ArticlesTest::class.java)

            intent.putExtra("repetitionTitle",getString(R.string.repetitionTitle))
            intent.putExtra("articlesTestText", articlesTestText)
            intent.putExtra("articlesTestCorrect", articlesTestCorrect)
            intent.putExtra("articlesTestAnswer_1", articlesTestAnswer_1)
            intent.putExtra("articlesTestAnswer_2", articlesTestAnswer_2)
            intent.putExtra("articlesTestAnswer_3", articlesTestAnswer_3)
            intent.putExtra("articlesTestAnswer_4", articlesTestAnswer_4)

            startActivity(intent)
            finish()
            }
        }

    }
