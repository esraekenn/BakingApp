package com.example.bakingapp.dto

data class ListDTO(
    val id:Int?,
    val name:String?,
    val ingredients:List<IngredientsDTO>?,
    val steps:List<StepsDTO>?,
    val servings:Int?,
    val image:String?
)