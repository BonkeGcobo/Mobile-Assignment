package com.example.mobileapplicationassignmentcsc2002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click_btn = findViewById<Button>(R.id.btnA)

        click_btn.setOnClickListener{
            Toast.makeText(this,"Button is clicked", Toast.LENGTH_SHORT).show()
        }

    }
}