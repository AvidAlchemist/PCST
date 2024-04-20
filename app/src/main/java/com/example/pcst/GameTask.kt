package com.example.pcst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.pcst.databinding.ActivityGameTaskBinding
import com.example.pcst.databinding.ActivityGameTheoryBinding

class GameTask : AppCompatActivity() {
    private lateinit var binding : ActivityGameTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        binding.taskTitleText.text = gameTaskTitle
        binding.taskArticleText.text = gameTaskText
        binding.taskTipText.text = gameTaskTip

        val intent = Intent(this, GameTest::class.java)
        intent.putExtra("repetitionTitle", getString(R.string.repetitionTitle))
                intent.putExtra("gameTestText", gameTestText)
                intent.putExtra("gameTestCorrect",gameTestCorrect)
                intent.putExtra("gameTestAnswer_1", gameTestAnswer_1)
                intent.putExtra("gameTestAnswer_2",gameTestAnswer_2)
                intent.putExtra("gameTestAnswer_3", gameTestAnswer_3)
                intent.putExtra("gameTestAnswer_4", gameTestAnswer_4)

        val gameTaskContinue : Button = findViewById(R.id.task_button_continue)
        gameTaskContinue.setOnClickListener {

            val passwordCheck = findViewById<EditText>(R.id.editTextNumberPassword)
            if(passwordCheck.text.toString() == gameTaskCorrect.toString()) {
                startActivity(intent)
                finish()
            }
            else {
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show()
            }
        }

        val gameTaskSkip : Button = findViewById(R.id.task_button_skip)
        gameTaskSkip.setOnClickListener {
            startActivity(intent)
            finish()
        }

    }
}