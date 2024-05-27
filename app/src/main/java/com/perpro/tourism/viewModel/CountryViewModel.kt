package com.perpro.tourism.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.perpro.tourism.entities.Country
import androidx.lifecycle.viewModelScope
import com.perpro.tourism.useCases.repository.ITourismRepository
import com.perpro.tourism.useCases.GetCountriesUseCase
import kotlinx.coroutines.launch

class CountryViewModel(
    private val repository: ITourismRepository
) : ViewModel() {
    private val _getCountriesUseCase =  GetCountriesUseCase(repository)
    private val _countries = MutableLiveData<List<Country>>()
    val countries: LiveData<List<Country>> = _countries

    fun loadCountries() {
        viewModelScope.launch {
            val countries = _getCountriesUseCase.getCountries()
            _countries.value = countries
        }
    }
}