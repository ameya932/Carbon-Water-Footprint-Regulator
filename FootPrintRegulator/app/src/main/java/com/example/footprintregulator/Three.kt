package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_electric_unit.*
import kotlinx.android.synthetic.main.activity_three.*

class Three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val elunit = intent.getStringExtra("eunit")
        textView59.text = elunit
        val wmunit = intent.getStringExtra("Wnit")
        textView60.text = wmunit
        val member = intent.getStringExtra("family_member")
        textView62.text = "$member"

        button94.setOnClickListener {

            Toast.makeText(this,"Next button was clicked", Toast.LENGTH_SHORT).show()
        }

    }
}