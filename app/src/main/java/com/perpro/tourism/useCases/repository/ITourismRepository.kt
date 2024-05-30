package com.perpro.tourism.useCases.repository

import com.perpro.tourism.entities.Attraction
import com.perpro.tourism.entities.Country

interface ITourismRepository {
    suspend fun getCountries(): List<Country>
    suspend fun getAttractions(countryId: Int): List<Attraction>
}