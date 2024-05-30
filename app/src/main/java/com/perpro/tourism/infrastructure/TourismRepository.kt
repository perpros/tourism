package com.perpro.tourism.infrastructure

import com.perpro.tourism.entities.Attraction
import com.perpro.tourism.entities.Country
import com.perpro.tourism.useCases.repository.ITourismRepository

class TourismRepository: ITourismRepository {
    override suspend fun getCountries(): List<Country> {
        return Country.loadCountries()
    }

    override suspend fun getAttractions(countryId: Int): List<Attraction> {
        return Attraction.loadAttractions(countryId)
    }
}