package com.example.moderndashboard

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clothingCard = findViewById<CardView>(R.id.clothingCard)
        clothingCard.setOnClickListener {
            val intent = Intent(this@MainActivity, ClothingActivity::class.java)
            startActivity(intent)
        }

        val electronicsCard = findViewById<CardView>(R.id.electronicsCard)
        electronicsCard.setOnClickListener {
            val intent = Intent(this@MainActivity, electronics::class.java)
            startActivity(intent)
        }

        val homeCard = findViewById<CardView>(R.id.homeCard)
        homeCard.setOnClickListener {
            val intent = Intent(this@MainActivity, home::class.java)
            startActivity(intent)
        }
        val beautyCard = findViewById<CardView>(R.id.beautyCard)
        beautyCard.setOnClickListener {
            val intent = Intent(this@MainActivity, beauty::class.java)
            startActivity(intent)
        }

        val pharmacyCard = findViewById<CardView>(R.id.pharmacyCard)
        pharmacyCard.setOnClickListener {
            val intent = Intent(this@MainActivity,pharmacy::class.java)
            startActivity(intent)
        }

        val GroceriesCard = findViewById<CardView>(R.id.GroceriesCard)
        GroceriesCard.setOnClickListener {
            val intent = Intent(this@MainActivity, Groceries::class.java)
            startActivity(intent)
        }


    }


}