package com.perpro.tourism.entities

import android.net.Uri

data class Attraction(
    val id: Int,
    val name: String,
    val countryId: Int,
    val description: String,
    val image: Uri,
){
    companion object{

        fun loadAttractions(countryId: Int): ArrayList<Attraction> {
            val attractions = ArrayList<Attraction>()

            val attraction01 = Attraction( 1, "attraction01", 1, "description", Uri.EMPTY)
            attractions.add(attraction01)

            val attraction02 = Attraction( 2, "attraction02", 1, "description", Uri.EMPTY)
            attractions.add(attraction02)

            val attraction03 = Attraction( 3, "attraction03", 1, "description", Uri.EMPTY)
            attractions.add(attraction03)

            val attraction04 = Attraction( 4, "attraction04", 2, "description", Uri.EMPTY)
            attractions.add(attraction04)

            val attraction05 = Attraction( 5, "attraction05", 2, "description", Uri.EMPTY)
            attractions.add(attraction05)

            val attraction06 = Attraction( 6, "attraction06", 3, "description", Uri.EMPTY)
            attractions.add(attraction06)

            val attraction07 = Attraction( 7, "attraction07", 3, "description", Uri.EMPTY)
            attractions.add(attraction07)

            val attraction08 = Attraction( 8, "attraction08", 4, "description", Uri.EMPTY)
            attractions.add(attraction08)

            val attraction09 = Attraction( 9, "attraction09", 5, "description", Uri.EMPTY)
            attractions.add(attraction09)

            val attraction10 = Attraction( 10, "attraction10", 6, "description", Uri.EMPTY)
            attractions.add(attraction10)

            val attraction11 = Attraction( 11, "attraction11", 7, "description", Uri.EMPTY)
            attractions.add(attraction11)

            val attraction12 = Attraction( 12, "attraction12", 8, "description", Uri.EMPTY)
            attractions.add(attraction12)

            val attraction13 = Attraction( 13, "attraction13", 9, "description", Uri.EMPTY)
            attractions.add(attraction13)

            val attraction14 = Attraction( 14, "attraction14", 10, "description", Uri.EMPTY)
            attractions.add(attraction14)

            return ArrayList(attractions.filter { c -> c.countryId == countryId })
        }
    }
}
