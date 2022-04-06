package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_one_bike.*
import kotlinx.android.synthetic.main.activity_page_two_two.*

class OneBike : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_bike)

        imageButton15.setOnClickListener {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

        button65.setOnClickListener {
            Toast.makeText(this, "Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button66.setOnClickListener {
            Toast.makeText(this, "Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button67.setOnClickListener {
            Toast.makeText(this, "Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ElectricUnit::class.java)
            startActivity(intent)
        }
    }
}