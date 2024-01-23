package com.abusiness.a230124

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton:Button=findViewById(R.id.button)
        val dato1:EditText=findViewById(R.id.editTextText)
        val dato2:EditText=findViewById(R.id.editTextText2)
        val resultado:TextView=findViewById(R.id.textView)
        boton.setOnClickListener {
            var dato11:Int=dato1.text.toString().toInt()
            var dato22:Int=dato2.text.toString().toInt()
            var suma:Int=dato11+dato22
            resultado.text=suma.toString()
        }
        boton.setOnClickListener {
            var dato11:Int=dato1.text.toString().toInt()
            var dato22:Int=dato2.text.toString().toInt()
            var suma:Int=dato11+dato22
            resultado.text=suma.toString()
        }
    }
}