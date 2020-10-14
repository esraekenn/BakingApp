package com.example.bakingapp.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingapp.dto.Recipe

class BakingListAdapter(
    val recipeList: List<Recipe>,
    private val setOnClickListener: (recipe: Recipe, position: Int) -> Unit
) :
    RecyclerView.Adapter<BakingListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BakingListViewHolder {
        return BakingListViewHolder(parent)
    }

    override fun onBindViewHolder(holder: BakingListViewHolder, position: Int) {
        holder.bind(recipeList[position], setOnClickListener)
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }
}