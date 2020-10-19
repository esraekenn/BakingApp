package com.example.bakingapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bakingapp.R
import com.example.bakingapp.databinding.FragmentDetailRecipeBinding
import com.example.bakingapp.dto.Recipe
import com.example.bakingapp.ui.adapter.RecipeDetailListAdapter
import retrofit2.Response

class RecipeDetailFragment(val data: Response<List<Recipe>>) : Fragment() {
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
        binding.rcList.layoutManager = LinearLayoutManager(activity)
        val bakinglist = ArrayList(data.body()!!)
        binding.rcList.adapter =
            RecipeDetailListAdapter(bakinglist) { recipe: Recipe, position: Int ->
                val recipeFragment = RecipeFragment()
                fragmentManager!!.beginTransaction()
                    .replace(R.id.kase, recipeFragment).commit()


            }
    }


}