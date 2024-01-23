package com.example.myapplication

import android.R
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener{ tirarDado() }
    }


    private fun tirarDado() {
        Toast.makeText(this,"botón clickao",Toast.LENGTH_SHORT).show()
    }
}


