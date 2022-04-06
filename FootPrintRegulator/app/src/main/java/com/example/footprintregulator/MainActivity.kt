package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val name = myName.text.toString()

            Toast.makeText(this,"Next button was clicked",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Homepage::class.java)
            intent.putExtra(AboutMe.NAME,name)
            startActivity(intent)
        }
        }
    }




