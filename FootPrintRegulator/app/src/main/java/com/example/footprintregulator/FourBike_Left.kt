package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_four_bike.*
import kotlinx.android.synthetic.main.activity_four_bike_left.*

class FourBike_Left : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_bike_left)

        imageButton20.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
        button86.setOnClickListener {
            Toast.makeText(this, "Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button87.setOnClickListener {
            Toast.makeText(this, "Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button88.setOnClickListener {
            Toast.makeText(this, "Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button89.setOnClickListener {
            Toast.makeText(this, "Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button90.setOnClickListener {
            Toast.makeText(this, "Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ElectricUnit::class.java)
            startActivity(intent)
        }
    }
}