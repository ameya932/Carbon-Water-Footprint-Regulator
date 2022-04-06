package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_first_page.*
import kotlinx.android.synthetic.main.activity_four_car.*
import kotlinx.android.synthetic.main.activity_four_left_car.*

class Four_leftCar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_left_car)

        imageButton13.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
        button46.setOnClickListener {
            Toast.makeText(this,"Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button48.setOnClickListener {
            Toast.makeText(this,"Diesel button was clicked", Toast.LENGTH_SHORT).show()
        }
        button47.setOnClickListener {
            Toast.makeText(this,"CNG button was clicked", Toast.LENGTH_SHORT).show()
        }
        button49.setOnClickListener {
            Toast.makeText(this,"Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button50.setOnClickListener {
            Toast.makeText(this,"Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button52.setOnClickListener {
            Toast.makeText(this,"Diesel button was clicked", Toast.LENGTH_SHORT).show()
        }
        button51.setOnClickListener {
            Toast.makeText(this,"CNG button was clicked", Toast.LENGTH_SHORT).show()
        }
        button53.setOnClickListener {
            Toast.makeText(this,"Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button54.setOnClickListener {
            Toast.makeText(this,"Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PageTwo_Two::class.java)
            startActivity(intent)
        }

    }
}