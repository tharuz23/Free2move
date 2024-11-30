package com.example.free2move

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class ScooterInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle_info)

        val backButton = findViewById<Button>(R.id.backButton)

        // Type Spinner
        val typeSpinner = findViewById<Spinner>(R.id.typeSpinner)
        val intent = intent
        val category = intent.getStringExtra("category")

        // Set appropriate spinner values based on category
        if ("Scooter" == category) {
            val typeAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.bike_models, android.R.layout.simple_spinner_item
            )
            typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            typeSpinner.adapter = typeAdapter
        }


        backButton.setOnClickListener {
            val intent = Intent(this@ScooterInfo, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}
