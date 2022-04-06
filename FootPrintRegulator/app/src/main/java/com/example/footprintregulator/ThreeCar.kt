package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_three_car.*

class ThreeCar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_car)

        imageButton10.setOnClickListener {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

        button28.setOnClickListener {
            Toast.makeText(this,"Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button30.setOnClickListener {
            Toast.makeText(this,"Diesel button was clicked", Toast.LENGTH_SHORT).show()
        }
        button29.setOnClickListener {
            Toast.makeText(this,"CNG button was clicked", Toast.LENGTH_SHORT).show()
        }
        button31.setOnClickListener {
            Toast.makeText(this,"Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button32.setOnClickListener {
            Toast.makeText(this,"Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button33.setOnClickListener {
            Toast.makeText(this,"Diesel button was clicked", Toast.LENGTH_SHORT).show()
        }
        button34.setOnClickListener {
            Toast.makeText(this,"CNG button was clicked", Toast.LENGTH_SHORT).show()
        }
        button35.setOnClickListener {
            Toast.makeText(this,"Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button36.setOnClickListener {
            Toast.makeText(this,"Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Three_twoCar::class.java)
            startActivity(intent)
        }
    }
}