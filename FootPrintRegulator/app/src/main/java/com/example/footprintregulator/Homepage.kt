package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_homepage.*

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        imageButton.setOnClickListener {

            val intent = Intent(this,AboutMe::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {

            Toast.makeText(this,"Start button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,FirstPage::class.java)
            startActivity(intent)
        }
    }
}
