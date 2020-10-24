package com.example.bakingapp.ui.adapter.recipe

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingapp.R
import com.example.bakingapp.dto.Recipe

class BakingListViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate
        (
        R.layout.adapter_item_recipe_list, container, false
    )
) {
    val recipeName: TextView = itemView.findViewById(R.id.txt_recipe_name)
    val recipeImage: ImageView = itemView.findViewById(R.id.img_recipe)

    fun bind(recipe: Recipe, setOnClickListener: (recipe: Recipe, position: Int) -> Unit) {
        recipeName.text = recipe.name
        recipeImage.setImageResource(R.drawable.baking)
        itemView.setOnClickListener {
            setOnClickListener(recipe, position)
        }

    }
}