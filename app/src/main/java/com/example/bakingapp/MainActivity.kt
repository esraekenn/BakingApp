package com.example.bakingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.bakingapp.dto.BakingServiceProvider
import com.example.bakingapp.dto.ListDTO
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bakingServiceProvider=BakingServiceProvider()
        bakingServiceProvider.BakingService().getBaking().enqueue(object:Callback<List<ListDTO>>
        {
            override fun onFailure(call: Call<List<ListDTO>>, t: Throwable) {
                Log.v("TEST", "${t.message}")
            }

            override fun onResponse(call: Call<List<ListDTO>>, response: Response<List<ListDTO>>) {
                recipeCard1.setText(response.body()!![0].name)
                recipeCard2.setText(response.body()!![1].name)
                recipeCard3.setText(response.body()!![2].name)
                recipeCard4.setText(response.body()!![3].name)


            }

        })

    }
}
