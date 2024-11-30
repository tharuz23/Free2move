package com.example.free2move

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class TukTukInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle_info)


        val backButton = findViewById<Button>(R.id.backButton)

        // Type Spinner
        val typeSpinner = findViewById<Spinner>(R.id.typeSpinner)

        // Get category passed via Intent (optional for this activity if not needed)
        val intent = intent
        val category = intent.getStringExtra("category")

        // Set appropriate spinner values based on category
        if ("TukTuk" == category) {
            val typeAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.tuktuk_models, android.R.layout.simple_spinner_item
            )
            typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            typeSpinner.adapter = typeAdapter
        } else {
            // If category is not TukTuk, load general vehicle types
            val typeAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.vehicle_types, android.R.layout.simple_spinner_item
            )
            typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            typeSpinner.adapter = typeAdapter
        }


        backButton.setOnClickListener {
            val intent = Intent(this@TukTukInfo, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}
