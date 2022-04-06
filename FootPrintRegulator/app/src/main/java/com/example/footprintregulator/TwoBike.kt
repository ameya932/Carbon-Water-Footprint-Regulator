package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_one_bike.*
import kotlinx.android.synthetic.main.activity_two_bike.*

class TwoBike : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_bike)

        imageButton17.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
        button68.setOnClickListener {
            Toast.makeText(this, "Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button69.setOnClickListener {
            Toast.makeText(this, "Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button70.setOnClickListener {
            Toast.makeText(this, "Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button71.setOnClickListener {
            Toast.makeText(this, "Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button72.setOnClickListener {
            Toast.makeText(this, "Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ElectricUnit::class.java)
            startActivity(intent)
        }
    }
}