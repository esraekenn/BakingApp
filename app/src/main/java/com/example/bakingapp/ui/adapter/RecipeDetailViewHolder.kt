package com.example.bakingapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingapp.R
import com.example.bakingapp.dto.Recipe

class RecipeDetailViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate
        (
        R.layout.adapter_item_steps_list, container, false
    )
) {
    val stepName: TextView = itemView.findViewById(R.id.txt_step_name)
    fun bind(recipe: Recipe, setOnClickListener: (recipe: Recipe, position: Int) -> Unit) {
        stepName.text = recipe.steps?.get(position)?.description
        itemView.setOnClickListener {
            setOnClickListener(recipe, position)
        }

    }
}