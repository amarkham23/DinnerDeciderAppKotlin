package com.example.markham.andrew.dinnerdeciderapp_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val listOfFoods = arrayListOf("Burger King", "Alyssa's Farts", "Dog Meat", "Dylan's Mom's Spaghetti", "Literally The First Thing You See in the Fridge")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = java.util.Random()
            val randomFood = random.nextInt(listOfFoods.count())


            foodTxt.text = listOfFoods[randomFood]

        }

    }
}
