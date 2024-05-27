package com.perpro.tourism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.perpro.tourism.databinding.ActivityMainBinding
import com.perpro.tourism.infrastructure.TourismRepository
import com.perpro.tourism.viewModel.CountryViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var countryAdapter: CountryAdapter

    private  lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: CountryViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        viewModel = ViewModelProvider(this)[TourismViewModel::class.java]
        viewModel = CountryViewModel(repository = TourismRepository())


        countryAdapter = CountryAdapter(mutableListOf())

        binding.rvCountryItems.adapter = countryAdapter
        binding.rvCountryItems.layoutManager = LinearLayoutManager(this)

        viewModel.countries.observe(this) { countries ->
            countryAdapter.submitList(countries)
        }

        viewModel.loadCountries()
    }
}