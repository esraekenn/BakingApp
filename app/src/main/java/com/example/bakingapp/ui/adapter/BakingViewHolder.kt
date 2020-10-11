package com.example.bakingapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingapp.R
import com.example.bakingapp.dto.ListDTO

class BakingListViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate
        (
        R.layout.adapter_item_baking_list, container, false
    )
) {
    val recipeName: TextView = itemView.findViewById(R.id.txt_recipe_name)

    fun bind(listDTO: ListDTO) {
        recipeName.text = listDTO.name

    }
}