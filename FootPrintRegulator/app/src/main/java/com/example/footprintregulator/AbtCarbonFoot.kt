package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class AbtCarbonFoot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abt_carbon_foot)
    }

    fun openhomepage(view: View)
    {
        val intent = Intent(this,Homepage::class.java)
        startActivity(intent)
    }
}