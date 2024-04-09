package com.example.pcst.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pcst.Adapters.GamesAdapter
import com.example.pcst.Models.GamesModel
import com.example.pcst.R

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
        listGames.add(GamesModel(R.drawable.image_games, "RSA", "Easy"))
        listGames.add(GamesModel(R.drawable.image_games, "Password", "Medium"))
        listGames.add(GamesModel(R.drawable.image_games, "2FA", "Easy"))

        gamesAdapter = GamesAdapter(requireContext(), listGames)

        gamesRv.layoutManager = LinearLayoutManager(requireContext())
        gamesRv.adapter = gamesAdapter

        return view
    }

}