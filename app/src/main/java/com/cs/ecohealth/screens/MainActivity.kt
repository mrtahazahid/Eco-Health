package com.cs.ecohealth.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cs.ecohealth.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}