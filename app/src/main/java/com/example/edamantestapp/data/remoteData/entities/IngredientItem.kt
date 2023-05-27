package com.example.edamantestapp.data.remoteData.entities

data class IngredientItem(
    val text: String,
    val quantity: Double,
//"measure": "<unit>",
    val food: String,
    val weight: Double,
    val foodCategory: String,
    val foodId: String,
    val image: String,
)
