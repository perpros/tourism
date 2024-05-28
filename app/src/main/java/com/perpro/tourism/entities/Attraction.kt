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

            return attractions
        }
    }
}
