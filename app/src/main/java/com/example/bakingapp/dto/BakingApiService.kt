package com.example.bakingapp.dto

import retrofit2.Call
import retrofit2.http.GET

interface BakingApiService
{
    @GET("baking.json")
    fun getBaking(): Call<List<Recipe>>

}