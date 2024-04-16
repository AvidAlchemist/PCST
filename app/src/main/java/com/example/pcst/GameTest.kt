package com.example.pcst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.example.pcst.databinding.ActivityGameTaskBinding
import com.example.pcst.databinding.ActivityGameTestBinding

class GameTest : AppCompatActivity() {
    private lateinit var binding : ActivityGameTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repetitionTitle = intent.getStringExtra("repetitionTitle")
        val gameTestText = intent.getStringExtra("gameTestText")
        val gameTestCorrect = intent.getStringExtra("gameTestCorrect")
        val gameTestAnswer_1 = intent.getStringExtra("gameTestAnswer_1")
        val gameTestAnswer_2 = intent.getStringExtra("gameTestAnswer_2")
        val gameTestAnswer_3 = intent.getStringExtra("gameTestAnswer_3")
        val gameTestAnswer_4 = intent.getStringExtra("gameTestAnswer_4")

        binding.testTitleText.text = repetitionTitle
        binding.testTipText.text = gameTestText
        binding.radiobutton1.text = gameTestAnswer_1
        binding.radiobutton2.text = gameTestAnswer_2
        binding.radiobutton3.text = gameTestAnswer_3
        binding.radiobutton4.text = gameTestAnswer_4

        val gameTestContinue : Button = findViewById(R.id.test_continue_button)
        gameTestContinue.setOnClickListener {
            val answerFirst = findViewById<RadioButton>(R.id.radiobutton_1)
            val answerSecond = findViewById<RadioButton>(R.id.radiobutton_2)
            val answerThird = findViewById<RadioButton>(R.id.radiobutton_3)
            val answerFourth = findViewById<RadioButton>(R.id.radiobutton_4)

            when {
                answerFirst.text.toString() == gameTestCorrect.toString() && answerFirst.isChecked
                -> finish()
                answerSecond.text.toString() == gameTestCorrect.toString() && answerSecond.isChecked
                -> finish()
                answerThird.text.toString() == gameTestCorrect.toString() && answerThird.isChecked
                -> finish()
                answerFourth.text.toString() == gameTestCorrect.toString()  && answerFourth.isChecked
                -> finish()
                else -> Toast.makeText(this, "Wrong answer, try again.", Toast.LENGTH_SHORT).show()
            }

        }

    }
}