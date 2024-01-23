package com.abusiness.es

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var edad:EditText=findViewById(R.id.editTextText)
        val boton:Button=findViewById(R.id.button)
        var resultado:TextView=findViewById(R.id.textView)



        boton.setOnClickListener {
            var num = edad.text.toString().toIntOrNull()
         if(num == null)
             else num++
            edad.setText(/* text = */ num.toString())

        }

    }
}