package com.example.free2move

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class CarInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle_info)


        val backButton = findViewById<Button>(R.id.backButton)


        val typeSpinner = findViewById<Spinner>(R.id.typeSpinner)

        // Get category passed via Intent
        val intent = intent
        val category = intent.getStringExtra("category")

        // Set appropriate spinner values based on category
        if ("Car" == category) {
            val typeAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.car_models, android.R.layout.simple_spinner_item
            )
            typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            typeSpinner.adapter = typeAdapter
        } else if ("Bike" == category) {
            val typeAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.bike_models, android.R.layout.simple_spinner_item
            )
            typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            typeSpinner.adapter = typeAdapter
        }

        // Back Button Click Listener
        backButton.setOnClickListener {
            val intent = Intent(this@CarInfo, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}
