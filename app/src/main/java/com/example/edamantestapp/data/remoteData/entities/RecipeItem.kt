package com.example.edamantestapp.data.remoteData.entities

data class RecipeItem(
    val uri:String,
    val label:String,
    val image:String,
    val listImg:List<ImgItem>,
    val source:String,
    val url:String,
    val shareAs:String,
    val yield:String,
    val dietLabels:List<String>,
    val healthLabels:List<String>,
    val cautions:List<String>,
    val ingredientLines:List<String>,

)
