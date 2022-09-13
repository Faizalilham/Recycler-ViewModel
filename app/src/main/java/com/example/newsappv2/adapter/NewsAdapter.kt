package com.example.newsappv2.adapter

import com.example.newsappv2.model.News


import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.newsappv2.databinding.ListItemBinding

class NewsAdapter(var data : MutableList<News>, val listener : Clicked) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(val binding : ListItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.binding.apply {
            val (tittle,content,jurnalist,date,image) = data[position]
            tvNewsTittle.text = tittle
            tvNewsContent.text = content
            tvNewsJurnalis.text = jurnalist
            tvNewsDate.text = date
            for(i in image){
                newsImage.setImageResource(i.images)
            }

            card.setOnClickListener {
                listener.onClicked(data[position])
            }

//            card.startAnimation(AnimationUtils.loadAnimation(holder.itemView.context,R.anim.anim))
        }
    }

    override fun getItemCount(): Int = data.size

    interface Clicked{
        fun onClicked(news : News)
    }

    fun setDatas(datas : MutableList<News>){
        this.data = datas
    }

}