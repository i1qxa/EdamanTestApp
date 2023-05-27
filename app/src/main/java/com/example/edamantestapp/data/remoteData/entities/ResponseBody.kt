package com.example.edamantestapp.data.remoteData.entities

import kotlinx.serialization.Serializable

@Serializable
data class ResponseBody(
    val from:Int,
    val to:Int,
    val count:Int,
    val _links:Links,
    val hits:List<RecipeItem>,
    //val hits:List<String>,
)
