package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second_page.*
import kotlinx.android.synthetic.main.activity_three_two_car.*

class Three_twoCar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_two_car)

        imageButton11.setOnClickListener {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }
        button37.setOnClickListener {
            Toast.makeText(this,"Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button38.setOnClickListener {
            Toast.makeText(this,"Diesel button was clicked", Toast.LENGTH_SHORT).show()
        }
        button39.setOnClickListener {
            Toast.makeText(this,"CNG button was clicked", Toast.LENGTH_SHORT).show()
        }
        button40.setOnClickListener {
            Toast.makeText(this,"Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button41.setOnClickListener {
            Toast.makeText(this,"Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,PageTwo_Two::class.java)
            startActivity(intent)
        }

    }
}