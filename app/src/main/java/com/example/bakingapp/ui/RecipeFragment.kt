package com.example.bakingapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bakingapp.R
import com.example.bakingapp.databinding.FragmentRecipeBinding
import com.example.bakingapp.dto.BakingServiceProvider
import com.example.bakingapp.dto.ListDTO
import com.example.bakingapp.ui.adapter.BakingListAdapter
import kotlinx.android.synthetic.main.fragment_recipe.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecipeFragment : Fragment() {
    private lateinit var binding: FragmentRecipeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recipe, container, false)
        return binding.root

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        renderUI()
    }

    fun renderUI() {
        val bakingServiceProvider = BakingServiceProvider()
        bakingServiceProvider.BakingService().getBaking().enqueue(object : Callback<List<ListDTO>> {
            override fun onFailure(call: Call<List<ListDTO>>, t: Throwable) {
                Log.d("TAG", "Response = " + t.toString())
            }

            override fun onResponse(call: Call<List<ListDTO>>, response: Response<List<ListDTO>>) {
                rcList.layoutManager = LinearLayoutManager(activity)
                val herolist = ArrayList(response.body()!!)
                binding.rcList.adapter = BakingListAdapter(herolist)

            }

        })
    }

    companion object {

        fun newInstance() = RecipeFragment()
    }
}