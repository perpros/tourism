package com.perpro.tourism.useCases

import com.perpro.tourism.entities.Country
import com.perpro.tourism.useCases.repository.ITourismRepository

class GetCountriesUseCase(private val repository: ITourismRepository) {
    suspend fun getCountries(): List<Country> {
        return repository.getCountries()
    }
}