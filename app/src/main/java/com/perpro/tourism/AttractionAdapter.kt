package com.perpro.tourism

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.perpro.tourism.databinding.ItemAttractionBinding
import com.perpro.tourism.entities.Attraction


class AttractionAdapter(
    private var attractions: MutableList<Attraction>
): RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder>() {

    class AttractionViewHolder(private  val binding: ItemAttractionBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(attraction: Attraction){
            binding.attraction = attraction
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttractionViewHolder {
        return AttractionViewHolder(ItemAttractionBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AttractionViewHolder, position: Int) {
        holder.bind(attractions[position])
    }

    override fun getItemCount(): Int {
        return  attractions.size
    }

    fun submitList(_attractions: List<Attraction>) {
        attractions.addAll(_attractions)
    }
}