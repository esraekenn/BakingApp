package com.example.bakingapp.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingapp.dto.Steps

class RecipeDetailListAdapter(
    val stepsList: List<Steps>,
    private val setOnClickListener: (stepsList: Steps, position: Int) -> Unit
) :
    RecyclerView.Adapter<RecipeDetailViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeDetailViewHolder {
        return RecipeDetailViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecipeDetailViewHolder, position: Int) {
        holder.bind(stepsList[position], setOnClickListener)
    }

    override fun getItemCount(): Int {
        return stepsList.size
    }
}