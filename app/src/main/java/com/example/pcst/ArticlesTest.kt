package com.example.pcst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import com.example.pcst.databinding.ActivityArticlesTestBinding

class ArticlesTest : AppCompatActivity() {
    private lateinit var binding : ActivityArticlesTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticlesTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repetitionTitle = intent.getStringExtra("repetitionTitle")
        val articlesTestText = intent.getStringExtra("articlesTestText")
        val articlesTestCorrect = intent.getStringExtra("articlesTestCorrect")
        val articlesTestAnswer_1 = intent.getStringExtra("articlesTestAnswer_1")
        val articlesTestAnswer_2 = intent.getStringExtra("articlesTestAnswer_2")
        val articlesTestAnswer_3 = intent.getStringExtra("articlesTestAnswer_3")
        val articlesTestAnswer_4 = intent.getStringExtra("articlesTestAnswer_4")

        binding.articlesTestTitleText.text = repetitionTitle
        binding.articlesTestTipText.text = articlesTestText
        binding.articlesRadiobutton1.text = articlesTestAnswer_1
        binding.articlesRadiobutton2.text = articlesTestAnswer_2
        binding.articlesRadiobutton3.text = articlesTestAnswer_3
        binding.articlesRadiobutton4.text = articlesTestAnswer_4

        val articlesTestContinue : Button = findViewById(R.id.articles_test_continue_button)
        articlesTestContinue.setOnClickListener {
            val answerFirst = findViewById<RadioButton>(R.id.articles_radiobutton_1)
            val answerSecond = findViewById<RadioButton>(R.id.articles_radiobutton_2)
            val answerThird = findViewById<RadioButton>(R.id.articles_radiobutton_3)
            val answerFourth = findViewById<RadioButton>(R.id.articles_radiobutton_4)

            when {
                answerFirst.text.toString() == articlesTestCorrect.toString() && answerFirst.isChecked
                -> {
                    finish()
                    Toast.makeText(this, "Задание выполнено успешно!",
                        Toast.LENGTH_SHORT).show()
                }
                answerSecond.text.toString() == articlesTestCorrect.toString() && answerSecond.isChecked
                -> {
                    finish()
                    Toast.makeText(this, "Задание выполнено успешно!",
                        Toast.LENGTH_SHORT).show()
                }
                answerThird.text.toString() == articlesTestCorrect.toString() && answerThird.isChecked
                -> {
                    finish()
                    Toast.makeText(this, "Задание выполнено успешно!",
                        Toast.LENGTH_SHORT).show()
                }
                answerFourth.text.toString() == articlesTestCorrect.toString()  && answerFourth.isChecked
                -> {
                    finish()
                    Toast.makeText(this, "Задание выполнено успешно!",
                        Toast.LENGTH_SHORT).show()
                }
                else -> Toast.makeText(this, "Неправильный ответ!",
                    Toast.LENGTH_SHORT).show()
            }

        }

    }
}