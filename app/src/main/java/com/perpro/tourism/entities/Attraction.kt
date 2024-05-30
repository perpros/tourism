package com.perpro.tourism.entities

import android.net.Uri

data class Attraction(
    val id: Int,
    val name: String,
    val countryId: Int,
    val description: String,
    val image: Uri,
)
