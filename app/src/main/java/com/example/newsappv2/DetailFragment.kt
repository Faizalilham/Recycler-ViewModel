package com.example.newsappv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.newsappv2.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {


    private lateinit var binding : FragmentDetailBinding
    private val args by navArgs<DetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentDetailBinding.inflate(layoutInflater)
       return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData(){
        val listImage = mutableListOf<SlideModel>()
        binding.apply {
            tvDetailNewsTittle.text = args.datas.tittle
            tvDetailNewsContent.text = args.datas.content
            tvDetailNewsJurnalist.text = args.datas.jurnalist
            tvDetailNewsDate.text = args.datas.date

            for(i in args.datas.image){
                listImage.add(SlideModel(i.images))
            }
            detailNewsImage.setImageList(listImage, ScaleTypes.CENTER_CROP)

        }
    }
}