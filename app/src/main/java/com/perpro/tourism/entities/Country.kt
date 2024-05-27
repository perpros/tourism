package com.perpro.tourism.entities


data class Country (
    val id: Int,
    val name: String,
    val attractions: List<Attraction>? = null,
){
    companion object{

        fun loadCountries(): ArrayList<Country>{

            val countries = ArrayList<Country>()

            val country01 = Country( 1, "Iran1")
            countries.add(country01)

            val country02 = Country( 2, "Iran2")
            countries.add(country02)

            val country03 = Country( 3, "Iran3")
            countries.add(country03)

            val country04 = Country( 4, "Iran4")
            countries.add(country04)

            val country05 = Country( 5, "Iran5")
            countries.add(country05)

            val country06 = Country( 6, "Iran6")
            countries.add(country06)

            val country07 = Country( 7, "Iran7")
            countries.add(country07)

            val country08 = Country( 8, "Iran8")
            countries.add(country08)

            val country09 = Country( 9, "Iran9")
            countries.add(country09)

            val country10 = Country( 10, "Iran10")
            countries.add(country10)

            val country11 = Country( 11, "Iran11")
            countries.add(country11)

            val country12 = Country( 12, "Iran12")
            countries.add(country12)

            val country13 = Country( 13, "Iran13")
            countries.add(country13)

            val country14 = Country( 14, "Iran14")
            countries.add(country14)

            val country15 = Country( 15, "Iran15")
            countries.add(country15)

            val country16 = Country( 16, "Iran16")
            countries.add(country16)

            return countries
        }

    }
}