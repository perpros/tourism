package com.perpro.tourism

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.perpro.tourism.databinding.FragmentAttractionsBinding
import com.perpro.tourism.entities.Country
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

        viewModel.loadAttractions(country.id)
    }

    companion object {
        fun newInstance(country: Country): AttractionsFragment {
            val fragment = AttractionsFragment()
            val args = Bundle()
            args.putParcelable("selectedCountry", country as Parcelable?)
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var country: Country

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            country = it.getParcelable("selectedCountry", Country::class.java)!! // Use !! for non-null safety (consider null checks if necessary)
        }
    }
}