package com.example.pcst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
        val gameTaskID = intent.getStringExtra("gameTaskID")

        binding.taskTitleText.text = gameTaskTitle
        binding.taskArticleText.text = gameTaskText
        binding.taskTipText.text = gameTaskTip

        val intent = Intent(this, GameTest::class.java)
        intent.putExtra("repetitionTitle", getString(R.string.repetitionTitle))
        when(gameTaskID.toString()) {
            "RSA" -> {
                intent.putExtra("gameTestText", getString(R.string.rsaTestText))
                intent.putExtra("gameTestCorrect", getString(R.string.rsaTestCorrect))
                intent.putExtra("gameTestAnswer_1", getString(R.string.rsaAnswer_1))
                intent.putExtra("gameTestAnswer_2", getString(R.string.rsaAnswer_2))
                intent.putExtra("gameTestAnswer_3", getString(R.string.rsaAnswer_3))
                intent.putExtra("gameTestAnswer_4", getString(R.string.rsaAnswer_4))
            }
            "Password" -> {
                intent.putExtra("gameTestText", getString(R.string.passwordTestText))
                intent.putExtra("gameTestCorrect", getString(R.string.passwordTestCorrect))
                intent.putExtra("gameTestAnswer_1", getString(R.string.passwordAnswer_1))
                intent.putExtra("gameTestAnswer_2", getString(R.string.passwordAnswer_2))
                intent.putExtra("gameTestAnswer_3", getString(R.string.passwordAnswer_3))
                intent.putExtra("gameTestAnswer_4", getString(R.string.passwordAnswer_4))
            }
            "2FA" -> {
                intent.putExtra("gameTestText", getString(R.string.twofactorTestText))
                intent.putExtra("gameTestCorrect", getString(R.string.twofactorTestCorrect))
                intent.putExtra("gameTestAnswer_1", getString(R.string.twofactorAnswer_1))
                intent.putExtra("gameTestAnswer_2", getString(R.string.twofactorAnswer_2))
                intent.putExtra("gameTestAnswer_3", getString(R.string.twofactorAnswer_3))
                intent.putExtra("gameTestAnswer_4", getString(R.string.twofactorAnswer_4))
            }

        }
        val gameTaskContinue : Button = findViewById(R.id.task_button_continue)
        gameTaskContinue.setOnClickListener {

            val passwordCheck = findViewById<EditText>(R.id.editTextNumberPassword)
            if(passwordCheck.text.toString() == gameTaskCorrect.toString())
            {
                startActivity(intent)
                finish()
            }
            else {
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show()
            }
        }

        val gameTaskSkip : Button = findViewById(R.id.task_button_skip)
        gameTaskSkip.setOnClickListener {
            //val intent = Intent(this, GameTest::class.java)

            startActivity(intent)
            finish()
        }

    }
}