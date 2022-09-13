package com.example.newsapp.model


import java.io.Serializable


data class News(
    val tittle : String,
    val content : String,
    val jurnalist : String,
    val date : String,
    val image : MutableList<ListImage>
) :Serializable

data class ListImage(
    val images : Int
):Serializable
