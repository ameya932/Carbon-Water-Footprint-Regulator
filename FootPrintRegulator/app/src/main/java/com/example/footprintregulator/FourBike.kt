package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_four_bike.*
import kotlinx.android.synthetic.main.activity_three_bike.*

class FourBike : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_bike)

        imageButton19.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

        button81.setOnClickListener {
            Toast.makeText(this, "Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button82.setOnClickListener {
            Toast.makeText(this, "Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button83.setOnClickListener {
            Toast.makeText(this, "Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button84.setOnClickListener {
            Toast.makeText(this, "Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button85.setOnClickListener {
            Toast.makeText(this, "Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FourBike_Left::class.java)
            startActivity(intent)
        }
    }
}