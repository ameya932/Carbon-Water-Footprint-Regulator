package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_about_me.*

class AboutMe : AppCompatActivity() {


    companion object{
        const val NAME = "NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        val name = intent.getStringExtra(NAME)
        textView12.text = "$name"
    }

    fun abtCarFoot(view: View)
    {
        Toast.makeText(this,"CarbonFootprint button was clicked", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,AbtCarbonFoot::class.java)
        startActivity(intent)
    }

    fun abtWarFoot(view: View)
    {
        Toast.makeText(this,"WaterFootprint button was clicked", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,AbtWaterFoot::class.java)
        startActivity(intent)
    }
}