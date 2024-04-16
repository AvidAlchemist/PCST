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

        binding.articlesTitleImage.setImageResource(articlesTitleImage)
        binding.articlesText.text = articlesText

        val articlesContinueButton : Button = findViewById(R.id.articles_button)
        articlesContinueButton.setOnClickListener {
            val intent = Intent(this, ArticlesTest::class.java)
            when (binding.articlesText.text) {
                getString(R.string.rsaFactsText) -> {
                    intent.putExtra("repetitionTitle",getString(R.string.repetitionTitle))
                    intent.putExtra("articlesTestText", getString(R.string.rsaFactsTestText))
                    intent.putExtra("articlesTestCorrect", getString(R.string.rsaFactsCorrect))
                    intent.putExtra("articlesTestAnswer_1", getString(R.string.rsaFactsAnswer_1))
                    intent.putExtra("articlesTestAnswer_2", getString(R.string.rsaFactsAnswer_2))
                    intent.putExtra("articlesTestAnswer_3", getString(R.string.rsaFactsAnswer_3))
                    intent.putExtra("articlesTestAnswer_4", getString(R.string.rsaFactsAnswer_4))

                }
                getString(R.string.cryptanalysisText) -> {
                    intent.putExtra("repetitionTitle",getString(R.string.repetitionTitle))
                    intent.putExtra("articlesTestText", getString(R.string.cryptanalysisTestText))
                    intent.putExtra("articlesTestCorrect", getString(R.string.cryptanalysisCorrect))
                    intent.putExtra("articlesTestAnswer_1", getString(R.string.cryptanalysisAnswer_1))
                    intent.putExtra("articlesTestAnswer_2", getString(R.string.cryptanalysisAnswer_2))
                    intent.putExtra("articlesTestAnswer_3", getString(R.string.cryptanalysisAnswer_3))
                    intent.putExtra("articlesTestAnswer_4", getString(R.string.cryptanalysisAnswer_4))
                }
                getString(R.string.shannonText) -> {
                    intent.putExtra("repetitionTitle",getString(R.string.repetitionTitle))
                    intent.putExtra("articlesTestText", getString(R.string.shannonTestText))
                    intent.putExtra("articlesTestCorrect", getString(R.string.shannonCorrect))
                    intent.putExtra("articlesTestAnswer_1", getString(R.string.shannonAnswer_1))
                    intent.putExtra("articlesTestAnswer_2", getString(R.string.shannonAnswer_2))
                    intent.putExtra("articlesTestAnswer_3", getString(R.string.shannonAnswer_3))
                    intent.putExtra("articlesTestAnswer_4", getString(R.string.shannonAnswer_4))
                }
            }
            startActivity(intent)
            finish()
        }

    }
}