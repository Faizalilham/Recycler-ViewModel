package com.example.newsapp

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.adapter.NewsAdapter
import com.example.newsapp.databinding.ActivityMainBinding
import com.example.newsapp.model.News
import com.example.newsapp.viewmodel.NewsViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var newsViewModel: NewsViewModel
    private lateinit var newsAdapter: NewsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        newsViewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        setContentView(binding.root)
        setRecycler()
        newsViewModel.getData()
        newsViewModel.listNews.observe(this){
            newsAdapter.setDatas(it)
        }
    }

    private fun setRecycler(){
        newsAdapter = NewsAdapter(mutableListOf(),object : NewsAdapter.Clicked{
            override fun onClicked(news: News) {
                startActivity(Intent(this@MainActivity,DetailActivity::class.java).also{
                    it.putExtra("News",news)
                })
            }
        })

        binding.newsRecycler.apply {
            adapter = newsAdapter
            layoutManager = if(applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
                GridLayoutManager(this@MainActivity,2)
            }else{
                LinearLayoutManager(this@MainActivity)
            }

        }
    }
}