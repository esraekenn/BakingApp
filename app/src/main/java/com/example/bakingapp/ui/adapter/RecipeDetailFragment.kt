package com.example.bakingapp.ui.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.bakingapp.R
import com.example.bakingapp.databinding.FragmentDetailRecipeBinding

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


}