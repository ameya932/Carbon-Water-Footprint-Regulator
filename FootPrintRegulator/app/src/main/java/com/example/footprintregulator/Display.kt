package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_display.*
import kotlinx.android.synthetic.main.activity_electric_unit.*

class Display : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)


        button95.setOnClickListener {

            Toast.makeText(this,"Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Tax::class.java)
            startActivity(intent)
        }

    }
}