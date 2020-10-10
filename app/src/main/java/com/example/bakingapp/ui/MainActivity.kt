package com.example.bakingapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bakingapp.R
import com.example.bakingapp.dto.BakingServiceProvider
import com.example.bakingapp.dto.ListDTO
import com.example.bakingapp.ui.adapter.BakingListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rcList.layoutManager = LinearLayoutManager(this)

        val bakingServiceProvider=BakingServiceProvider()
        bakingServiceProvider.BakingService().getBaking().enqueue(object : Callback<List<ListDTO>> {
            override fun onFailure(call: Call<List<ListDTO>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<ListDTO>>, response: Response<List<ListDTO>>) {
                val herolist = ArrayList(response.body()!!)
                rcList.adapter = BakingListAdapter(herolist)

            }

        })

    }
}
