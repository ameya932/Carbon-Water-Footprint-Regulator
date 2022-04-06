package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_electric_unit.*
import kotlinx.android.synthetic.main.activity_pg_twofor_one.*

class PgTwoforOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pg_twofor_one)

        button8.setOnClickListener {
            val family = editTextNumber24.text.toString()

            Toast.makeText(this,"Next button was clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SecondPage::class.java)
            intent.putExtra("family_member", family)
            startActivity(intent)
        }
    }
}