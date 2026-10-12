package com.example.passdataapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)

        val name = intent.getStringExtra("NAME_KEY")
        val email = intent.getStringExtra("EMAIL_KEY")

        tvName.text = name
        tvEmail.text = email
    }
}
