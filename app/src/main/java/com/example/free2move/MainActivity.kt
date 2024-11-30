package com.example.free2move

import android.content.Intent
import android.os.Bundle //pass data bw activites
import android.view.View //UI components
import android.widget.Button
import android.widget.TextView //displays text
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val createAccount = findViewById<TextView>(R.id.createAccount)
        createAccount.setOnClickListener { view: View? ->
            val intent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

        // Login Button
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener { view: View? ->
            val intent = Intent(this@MainActivity, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}
