package com.example.bakingapp.dto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BakingServiceProvider
{
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/")
        .build()
    private val apiService:BakingApiService=retrofit.create(BakingApiService::class.java)
    fun BakingService():BakingApiService=apiService
}
