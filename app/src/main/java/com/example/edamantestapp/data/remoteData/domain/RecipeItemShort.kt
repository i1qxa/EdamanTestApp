package com.example.edamantestapp.data.remoteData.domain

data class RecipeItemShort(
    val uri:String,
    val label:String,
    val imgThumbnail:String,
    val calories:Int,
    val totalTime:Double,
    val cuisineType:List<String>,
    val mealType:List<String>,
    val dishType:List<String>,

)
