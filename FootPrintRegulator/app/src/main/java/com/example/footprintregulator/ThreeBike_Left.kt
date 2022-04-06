package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_three_bike.*
import kotlinx.android.synthetic.main.activity_three_bike_left.*

class ThreeBike_Left : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_bike_left)

        imageButton18.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

        button78.setOnClickListener {
            Toast.makeText(this, "Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button79.setOnClickListener {
            Toast.makeText(this, "Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button80.setOnClickListener {
            Toast.makeText(this, "Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ElectricUnit::class.java)
            startActivity(intent)
        }
    }
}