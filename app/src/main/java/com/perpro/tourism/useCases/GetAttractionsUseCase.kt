package com.perpro.tourism.useCases

import com.perpro.tourism.entities.Attraction
import com.perpro.tourism.useCases.repository.ITourismRepository

class GetAttractionsUseCase(private val repository: ITourismRepository) {
    suspend fun getAttractions(countryId: Int): List<Attraction> {
        return repository.getAttractions(countryId)
    }
}