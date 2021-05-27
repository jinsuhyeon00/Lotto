package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        Toast.makeText(this,"Name Activity", Toast.LENGTH_LONG).show()

        val btnGoResultName = findViewById<Button>(R.id.btnGoResultName)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnGoResultName.setOnClickListener {
            startActivity(Intent(this,ResultActivity::class.java))
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}