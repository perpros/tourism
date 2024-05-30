package com.perpro.tourism.entities

import android.os.Parcel
import android.os.Parcelable


data class Country (
    val id: Int,
    val name: String,
    val attractions: List<Attraction>? = null,
): Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readArrayList(Attraction::class.java.classLoader) as List<Attraction>?
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeList(attractions)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Country> {
        override fun createFromParcel(parcel: Parcel): Country {
            return Country(parcel)
        }

        override fun newArray(size: Int): Array<Country?> {
            return arrayOfNulls(size)
        }


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


            return countries
        }
    }
}