package com.perpro.tourism

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.perpro.tourism.databinding.FragmentAttractionsBinding
import com.perpro.tourism.infrastructure.TourismRepository
import com.perpro.tourism.viewModel.AttractionViewModel

class AttractionsFragment:Fragment(R.layout.fragment_attractions) {
    lateinit var binding: FragmentAttractionsBinding
    private lateinit var attractionAdapter: AttractionAdapter
    private lateinit var viewModel: AttractionViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentAttractionsBinding.bind(view)
        viewModel = AttractionViewModel(repository = TourismRepository())
        attractionAdapter = AttractionAdapter(mutableListOf())

        binding.rvAttractionItems.adapter = attractionAdapter
        binding.rvAttractionItems.layoutManager = LinearLayoutManager(requireContext())

        viewModel.attractions.observe(viewLifecycleOwner) { attractions ->
            attractionAdapter.submitList(attractions)
        }

        viewModel.loadAttractions(1)
    }
}