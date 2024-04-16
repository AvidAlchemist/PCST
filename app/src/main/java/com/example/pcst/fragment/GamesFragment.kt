package com.example.pcst.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pcst.Adapters.GamesAdapter
import com.example.pcst.GameTheory
import com.example.pcst.Models.GamesModel
import com.example.pcst.R
import com.example.pcst.databinding.ActivityGameTheoryBinding

class GamesFragment : Fragment() {

    private lateinit var gamesAdapter: GamesAdapter
    private lateinit var listGames : ArrayList<GamesModel>
    private lateinit var gamesRv : RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_games, container, false)

        gamesRv = view.findViewById(R.id.games_RV)

        listGames = ArrayList()
        listGames.add(GamesModel(R.drawable.image_games,  getString(R.string.rsaTitle), getString(R.string.difficultyEasy)))
        listGames.add(GamesModel(R.drawable.image_games, getString(R.string.passwordTitle), getString(R.string.difficultyMedium)))
        listGames.add(GamesModel(R.drawable.image_games, getString(R.string.twofactorTitle), getString(R.string.difficultyEasy)))

        gamesAdapter = GamesAdapter(requireContext(), listGames)

        gamesRv.layoutManager = LinearLayoutManager(requireContext())
        gamesRv.adapter = gamesAdapter

        return view
    }

}