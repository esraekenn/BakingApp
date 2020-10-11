package com.example.bakingapp.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingapp.dto.ListDTO

class BakingListAdapter(val bakingList: List<ListDTO>) :
    RecyclerView.Adapter<BakingListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BakingListViewHolder {
        return BakingListViewHolder(parent)
    }

    override fun onBindViewHolder(holder: BakingListViewHolder, position: Int) {
        holder.bind(bakingList[position])
    }

    override fun getItemCount(): Int {
        return bakingList.size
    }
}