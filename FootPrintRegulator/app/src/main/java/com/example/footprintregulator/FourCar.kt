package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_four_car.*
import kotlinx.android.synthetic.main.activity_second_page.*

class FourCar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_car)

        imageButton12.setOnClickListener {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }
        button42.setOnClickListener {
            Toast.makeText(this,"Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button43.setOnClickListener {
            Toast.makeText(this,"Diesel button was clicked", Toast.LENGTH_SHORT).show()
        }
        button44.setOnClickListener {
            Toast.makeText(this,"CNG button was clicked", Toast.LENGTH_SHORT).show()
        }
        button45.setOnClickListener {
            Toast.makeText(this,"Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button55.setOnClickListener {
            Toast.makeText(this,"Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button57.setOnClickListener {
            Toast.makeText(this,"Diesel button was clicked", Toast.LENGTH_SHORT).show()
        }
        button56.setOnClickListener {
            Toast.makeText(this,"CNG button was clicked", Toast.LENGTH_SHORT).show()
        }
        button58.setOnClickListener {
            Toast.makeText(this,"Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button59.setOnClickListener {
            Toast.makeText(this,"Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Four_leftCar::class.java)
            startActivity(intent)
        }
    }
}