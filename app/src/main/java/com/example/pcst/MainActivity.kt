package com.example.pcst

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.pcst.databinding.ActivityMainBinding
import com.example.pcst.fragment.ArticlesFragment
import com.example.pcst.fragment.GamesFragment
import com.example.pcst.fragment.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navigationView = findNavController(R.id.fragment_container)

        bottomNavView.setupWithNavController(navigationView)
    }

}
        /*textView.setOnClickListener { moveToNextScreen() }
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_view)
    val menuItem = bottomNavigationView.menu.findItem(R.id.navigation_games)
    val actionView = menuItem.actionView
    if(actionView is ConstraintLayout){
        val textViewGames: TextView = actionView.findViewById<TextView>(R.id.text_games)
        textViewGames.text = "AAAA"
    }

    private fun moveToNextScreen() {
        val intent = Intent(this, GameTheory::class.java)

       /* val transmittedTitle = getString(R.string.theory_title_text)
        intent.putExtra(GameTheory.TRANSMITTED_TITLE, transmittedTitle)*/
        startActivity(intent)
    }*/
