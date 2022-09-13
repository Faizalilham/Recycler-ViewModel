package com.example.newsappv2.model

import java.io.Serializable

data class News(
    val tittle : String,
    val content : String,
    val jurnalist : String,
    val date: String,
    val image : MutableList<ListImage>
): Serializable

data class ListImage(
    val images : Int
):Serializable