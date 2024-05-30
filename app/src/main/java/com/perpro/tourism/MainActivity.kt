package com.perpro.tourism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.perpro.tourism.entities.Country


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (savedInstanceState == null) {
            val countriesFragment = CountriesFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view, countriesFragment)
                .commit()
        }
    }

    fun navigateToAttractionsFragment(country: Country) {
        val attractionsFragment = AttractionsFragment.newInstance(country)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, attractionsFragment)
            .addToBackStack(null) // Add to backstack for back button support
            .commit()
    }
}