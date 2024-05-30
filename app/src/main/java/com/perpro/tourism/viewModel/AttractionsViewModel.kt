package com.perpro.tourism.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.perpro.tourism.entities.Attraction
import com.perpro.tourism.useCases.repository.ITourismRepository
import com.perpro.tourism.useCases.GetAttractionsUseCase
import kotlinx.coroutines.launch

class AttractionsViewModel(
    private val repository: ITourismRepository
) : ViewModel() {
    private val _getAttractionsUseCase =  GetAttractionsUseCase(repository)
    private val _attractions = MutableLiveData<List<Attraction>>()
    val attractions: LiveData<List<Attraction>> = _attractions

    fun loadAttractions(countryId: Int) {
        viewModelScope.launch {
            val attractions = _getAttractionsUseCase.getAttractions(countryId)
            _attractions.value = attractions
        }
    }
}