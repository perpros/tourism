package com.perpro.tourism

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.perpro.tourism.databinding.ItemCountryBinding
import com.perpro.tourism.entities.Country


class CountryAdapter(
    private var countries: MutableList<Country>
): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    class CountryViewHolder(private  val binding: ItemCountryBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(country: Country){
            binding.country = country
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        return CountryViewHolder(ItemCountryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    override fun getItemCount(): Int {
        return  countries.size
    }

    fun submitList(_countries: List<Country>) {
        countries.addAll(_countries)
    }
}