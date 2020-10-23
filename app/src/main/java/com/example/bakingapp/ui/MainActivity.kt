package com.example.bakingapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bakingapp.R
import com.google.android.exoplayer2.SimpleExoPlayer

class MainActivity : AppCompatActivity() {
    private lateinit var x: SimpleExoPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bookDetailFragment = RecipeFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.kase, bookDetailFragment)
            .commit()


    }


    fun denenme() {

        x = SimpleExoPlayer.Builder(this).build()

    }
}
