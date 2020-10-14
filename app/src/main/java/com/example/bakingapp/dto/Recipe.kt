package com.example.bakingapp.dto

data class Recipe(
    val id: Int?,
    val name: String?,
    val ingredients: List<Ingredients>?,
    val steps: List<Steps>?,
    val servings: Int?,
    val image: String?
)