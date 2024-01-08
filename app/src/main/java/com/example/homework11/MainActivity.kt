package com.example.homework11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEmail: Button = findViewById(R.id.email)
        btnEmail.setOnClickListener {
            Toast.makeText(this, "Email button is pressed", Toast.LENGTH_LONG).show()
        }
        val btnPhone: Button = findViewById(R.id.phone)
        btnPhone.setOnClickListener {
            Toast.makeText(this, "Phone button is pressed", Toast.LENGTH_LONG).show()
        }

    }
}