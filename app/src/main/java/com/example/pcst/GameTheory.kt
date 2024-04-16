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

        binding.theoryTitleText.text = gameTheoryTitle
        binding.theoryArticleText.text = gameTheoryArticle

        val gameTheoryButton : Button = findViewById(R.id.theory_button)
        gameTheoryButton.setOnClickListener {
            val intent = Intent(this, GameTask::class.java)
            when (binding.theoryTitleText.text) {
                getString(R.string.rsaTitle) -> {
                    intent.putExtra("gameTaskTitle",getString(R.string.rsaTaskTitle))
                    intent.putExtra("gameTaskText", getString(R.string.rsaTaskText))
                    intent.putExtra("gameTaskTip", getString(R.string.rsaTaskTip))
                    intent.putExtra("gameTaskCorrect", getString(R.string.rsaTaskCorrect))
                    intent.putExtra("gameTaskID", "RSA")

                }
                getString(R.string.passwordTitle) -> {
                    intent.putExtra("gameTaskTitle",getString(R.string.passwordTaskTitle))
                    intent.putExtra("gameTaskText", getString(R.string.passwordTaskText))
                    intent.putExtra("gameTaskTip", getString(R.string.passwordTaskTip))
                    intent.putExtra("gameTaskCorrect", getString(R.string.passwordTaskCorrect))
                    intent.putExtra("gameTaskID", "Password")
                }
                getString(R.string.twofactorTitle) -> {
                    intent.putExtra("gameTaskTitle",getString(R.string.twofactorTaskTitle))
                    intent.putExtra("gameTaskText", getString(R.string.twofactorTaskText))
                    intent.putExtra("gameTaskTip", getString(R.string.twofactorTaskTip))
                    intent.putExtra("gameTaskCorrect", getString(R.string.twofactorTaskCorrect))
                    intent.putExtra("gameTaskID", "2FA")
                }
            }
            startActivity(intent)
            finish()
        }

    }
}