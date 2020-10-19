package com.example.bakingapp.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingapp.dto.Recipe

class RecipeDetailListAdapter(
    val recipeList: List<Recipe>,
    private val setOnClickListener: (recipe: Recipe, position: Int) -> Unit
) :
    RecyclerView.Adapter<RecipeDetailViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeDetailViewHolder {
        return RecipeDetailViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecipeDetailViewHolder, position: Int) {
        holder.bind(recipeList[position], setOnClickListener)
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }
}