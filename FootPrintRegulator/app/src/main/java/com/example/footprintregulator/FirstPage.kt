package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_first_page.*

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        button5.setOnClickListener {

            Toast.makeText(this,"Yes button was clicked",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,PgOneforOne::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {

            Toast.makeText(this,"No button was clicked",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,PgTwoforOne::class.java)
            startActivity(intent)
        }
        imageButton2.setOnClickListener {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }
    }
}