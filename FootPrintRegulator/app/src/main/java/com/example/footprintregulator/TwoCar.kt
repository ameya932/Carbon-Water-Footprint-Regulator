package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_two_car.*

class TwoCar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_car)

        imageButton9.setOnClickListener {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            Toast.makeText(this,"Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button21.setOnClickListener {
            Toast.makeText(this,"Diesel button was clicked", Toast.LENGTH_SHORT).show()
        }
        button20.setOnClickListener {
            Toast.makeText(this,"CNG button was clicked", Toast.LENGTH_SHORT).show()
        }
        button22.setOnClickListener {
            Toast.makeText(this,"Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button23.setOnClickListener {
            Toast.makeText(this,"Petrol button was clicked", Toast.LENGTH_SHORT).show()
        }
        button25.setOnClickListener {
            Toast.makeText(this,"Diesel button was clicked", Toast.LENGTH_SHORT).show()
        }
        button24.setOnClickListener {
            Toast.makeText(this,"CNG button was clicked", Toast.LENGTH_SHORT).show()
        }
        button26.setOnClickListener {
            Toast.makeText(this,"Electric button was clicked", Toast.LENGTH_SHORT).show()
        }
        button27.setOnClickListener {
            Toast.makeText(this,"Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,PageTwo_Two::class.java)
            startActivity(intent)
        }
    }
}