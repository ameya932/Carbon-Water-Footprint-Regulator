package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second_page.*

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        imageButton7.setOnClickListener {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }
        button9.setOnClickListener {

            Toast.makeText(this,"1 button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,OneCar::class.java)
            startActivity(intent)
        }
        button10.setOnClickListener {

            Toast.makeText(this,"2 button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,TwoCar::class.java)
            startActivity(intent)
        }
        button11.setOnClickListener {
            Toast.makeText(this,"3 button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ThreeCar::class.java)
            startActivity(intent)
        }
        button12.setOnClickListener {
            Toast.makeText(this,"4 button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,FourCar::class.java)
            startActivity(intent)
        }
        button13.setOnClickListener {
            Toast.makeText(this,"More button was clicked", Toast.LENGTH_SHORT).show()
        }
        button91.setOnClickListener {
            Toast.makeText(this,"None button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,PageTwo_Two::class.java)
            startActivity(intent)
        }
    }
}