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
import com.example.bakingapp.databinding.FragmentDetailRecipeBinding
import com.example.bakingapp.dto.BakingServiceProvider
import com.example.bakingapp.dto.Recipe
import com.example.bakingapp.ui.adapter.RecipeDetailListAdapter
import kotlinx.android.synthetic.main.fragment_recipe.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecipeDetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailRecipeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_detail_recipe, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        renderUI()
    }

    private fun renderUI() {
        val bakingServiceProvider = BakingServiceProvider()
        bakingServiceProvider.BakingService().getBaking().enqueue(object : Callback<List<Recipe>> {
            override fun onFailure(call: Call<List<Recipe>>, t: Throwable) {

                Log.v("dfjf", "d")

            }

            override fun onResponse(call: Call<List<Recipe>>, response: Response<List<Recipe>>) {
                rcList.layoutManager = LinearLayoutManager(activity)
                val bakinglist = ArrayList(response.body()!!)
                binding.rcList.adapter =
                    RecipeDetailListAdapter(bakinglist) { steps: Recipe, position: Int ->
                        val recipeDetailFragment = RecipeDetailFragment()
                        fragmentManager!!.beginTransaction()
                            .replace(R.id.kase, recipeDetailFragment).commit()
                        Log.v("dfjf", "kfjslkkjsfkl")


                    }


            }

        })

    }
}