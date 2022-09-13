package com.example.newsappv2

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsappv2.adapter.NewsAdapter
import com.example.newsappv2.databinding.FragmentHomeBinding
import com.example.newsappv2.model.News
import com.example.newsappv2.viewmodel.NewsViewModel


class HomeFragment : Fragment() {


    private lateinit var binding : FragmentHomeBinding
    private lateinit var newsViewModel : NewsViewModel
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        newsViewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecycler()
        newsViewModel.getData()
        newsViewModel.listNews.observe(requireActivity()){
            newsAdapter.setDatas(it)
        }
    }

    private fun setRecycler(){
        newsAdapter = NewsAdapter(mutableListOf(),object : NewsAdapter.Clicked{
            override fun onClicked(news: News) {
                val args = HomeFragmentDirections.actionHomeFragmentToDetailFragment(news)
                findNavController().navigate(args)
            }
        })

        binding.newsRecycler.apply {
            adapter = newsAdapter
            layoutManager = if(context.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
                GridLayoutManager(activity,2)
            }else{
                LinearLayoutManager(activity)
            }
        }
    }
}