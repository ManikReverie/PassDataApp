package com.example.passdataapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val btnSend = findViewById<Button>(R.id.btnSend)

        btnSend.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NAME_KEY", name)
            intent.putExtra("EMAIL_KEY", email)
            startActivity(intent)
        }
    }
}