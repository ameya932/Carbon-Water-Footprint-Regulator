package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_electric_unit.*
import kotlinx.android.synthetic.main.activity_four_bike_left.*
import kotlinx.android.synthetic.main.activity_second_page.*

class ElectricUnit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electric_unit)

        imageButton21.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
        button92.setOnClickListener {
            val urElecUnit = editTextNumber22.text.toString()

            Toast.makeText(this,"Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Display::class.java)
            intent.putExtra("eunit", urElecUnit)
            startActivity(intent)
        }
    }
}