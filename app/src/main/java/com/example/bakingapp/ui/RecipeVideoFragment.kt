package com.example.bakingapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.bakingapp.R
import com.example.bakingapp.databinding.FragmentRecipeVideoBinding

class RecipeVideoFragment : Fragment() {
    private lateinit var binding: FragmentRecipeVideoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recipe, container, false)
        return binding.root

    }


}