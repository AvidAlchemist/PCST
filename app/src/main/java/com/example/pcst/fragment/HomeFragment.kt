package com.example.pcst.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pcst.Adapters.HomeAdapter
import com.example.pcst.Models.HomeModel
import com.example.pcst.R

class HomeFragment : Fragment() {

    private lateinit var homeAdapter: HomeAdapter
    private lateinit var listHome : ArrayList<HomeModel>
    private lateinit var homeRv : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        homeRv = view.findViewById(R.id.game_RV)

        listHome = ArrayList()
        listHome.add(HomeModel(R.drawable.ic_home_black_24dp, "Password", "$7"))
        listHome.add(HomeModel(R.drawable.ic_home_black_24dp, "Second", "$10"))
        listHome.add(HomeModel(R.drawable.ic_home_black_24dp, "Third", "$9"))

        homeAdapter = HomeAdapter(requireContext(), listHome)

        homeRv.layoutManager = LinearLayoutManager(requireContext())
        homeRv.adapter = homeAdapter

        return view
    }

}