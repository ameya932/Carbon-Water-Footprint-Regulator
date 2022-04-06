package com.example.footprintregulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pg_onefor_one.*

class PgOneforOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pg_onefor_one)

        button7.setOnClickListener {
            val wUnitMy = editTextNumber.text.toString()

            Toast.makeText(this,"Next button was clicked",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SecondPage::class.java)
            intent.putExtra("Wnit", wUnitMy)
            startActivity(intent)
        }
        imageButton3.setOnClickListener {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }
    }
}