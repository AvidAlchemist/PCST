package com.example.pcst.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pcst.Adapters.ArticlesAdapter
import com.example.pcst.Models.ArticlesModel
import com.example.pcst.R

class ArticlesFragment : Fragment() {

    private lateinit var articlesAdapter: ArticlesAdapter
    private lateinit var listArticles : ArrayList<ArticlesModel>
    private lateinit var articlesRv : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_articles, container, false)

        articlesRv = view.findViewById(R.id.articles_RV)

        listArticles = ArrayList()
        listArticles.add(ArticlesModel(R.drawable.image_articles, getString(R.string.rsaFactsTitle), "2 мин"))
        listArticles.add(ArticlesModel(R.drawable.image_articles, getString(R.string.cryptanalysisTitle), "5 мин"))
        listArticles.add(ArticlesModel(R.drawable.image_articles, getString(R.string.shannonTitle), "3 мин"))

        articlesAdapter = ArticlesAdapter(requireContext(), listArticles)

        articlesRv.layoutManager = LinearLayoutManager(requireContext())
        articlesRv.adapter = articlesAdapter

        return view
    }

}