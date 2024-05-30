package com.perpro.tourism

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.perpro.tourism.databinding.FragmentCountriesBinding
import com.perpro.tourism.entities.Country
import com.perpro.tourism.infrastructure.TourismRepository
import com.perpro.tourism.viewModel.CountryViewModel

class CountriesFragment: Fragment(R.layout.fragment_countries) {

    private lateinit var binding: FragmentCountriesBinding
    private lateinit var countryAdapter: CountryAdapter
    private lateinit var viewModel: CountryViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentCountriesBinding.bind(view)
        viewModel = CountryViewModel(repository = TourismRepository())
        countryAdapter = CountryAdapter(mutableListOf(), this::navigateToAttractions)

        binding.rvCountryItems.adapter = countryAdapter
        binding.rvCountryItems.layoutManager = LinearLayoutManager(requireContext())

        viewModel.countries.observe(viewLifecycleOwner) { countries ->
            countryAdapter.submitList(countries)
        }

        viewModel.loadCountries()
    }

    private fun navigateToAttractions(country: Country) {
        activity?.let { (activity as MainActivity).navigateToAttractionsFragment(country) }
    }
}