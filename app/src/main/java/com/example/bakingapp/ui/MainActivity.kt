package com.example.bakingapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bakingapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bookDetailFragment = RecipeFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.kase, bookDetailFragment)
            .commit()
    }
}
