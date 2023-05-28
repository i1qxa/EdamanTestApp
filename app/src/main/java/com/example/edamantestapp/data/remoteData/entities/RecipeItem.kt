package com.example.edamantestapp.data.remoteData.entities

import kotlinx.serialization.Serializable

@Serializable
data class RecipeItem(
    val uri:String,
    val label:String,
    val image:String,
    val images:Images,
    val source:String,
    val url:String,
    val shareAs:String,
    val yield:Double,
    val dietLabels:List<String>,
    val healthLabels:List<String>,
    val cautions:List<String>,
    val ingredientLines:List<String>,
    val ingredients:List<IngredientItem>,
    val calories:Float,
    val totalCO2Emissions:Float,
    val co2EmissionsClass:String,
    val totalWeight:Float,
    val totalTime:Double,
    val cuisineType:List<String>,
    val mealType:List<String>,
    val dishType:List<String>,
    val totalNutrients:TotalNutrient,
    val totalDaily:TotalNutrient,
    val digest:List<DigestItem>

)
