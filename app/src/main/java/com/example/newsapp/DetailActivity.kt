package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.newsapp.databinding.ActivityDetailBinding
import com.example.newsapp.model.News


class DetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()
    }

    private fun setData(){
        val news = intent.getSerializableExtra("News") as News
        val listImage = mutableListOf<SlideModel>()
        binding.apply {
            tvDetailNewsTittle.text = news.tittle
            tvDetailNewsContent.text = news.content
            tvDetailNewsJurnalist.text = news.jurnalist
            tvDetailNewsDate.text = news.date

            for(i in news.image){
                listImage.add(SlideModel(i.images))
            }
            detailNewsImage.setImageList(listImage,ScaleTypes.CENTER_CROP)

        }

    }



}