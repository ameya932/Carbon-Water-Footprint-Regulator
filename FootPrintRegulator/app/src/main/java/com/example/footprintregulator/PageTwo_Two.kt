package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_page_two_two.*
import kotlinx.android.synthetic.main.activity_second_page.*

class PageTwo_Two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two_two)

        imageButton14.setOnClickListener {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

        button60.setOnClickListener {
            Toast.makeText(this,"1 button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,OneBike::class.java)
            startActivity(intent)
        }
        button61.setOnClickListener {
            Toast.makeText(this,"2 button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,TwoBike::class.java)
            startActivity(intent)
        }
        button62.setOnClickListener {
            Toast.makeText(this,"3 button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ThreeBike::class.java)
            startActivity(intent)
        }
        button63.setOnClickListener {
            Toast.makeText(this,"4 button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,FourBike::class.java)
            startActivity(intent)
        }
        button64.setOnClickListener {
            Toast.makeText(this,"More button was clicked", Toast.LENGTH_SHORT).show()
        }
        button93.setOnClickListener {
            Toast.makeText(this,"None button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ElectricUnit::class.java)
            startActivity(intent)
        }
    }
}