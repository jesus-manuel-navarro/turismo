package com.abusiness.turismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageView = findViewById<ImageView>(R.id.selectedImageView)
        val imageResId = intent.getIntExtra("imageResId", 0)
    // todo para recoger de la vista anterior lo que nos  venga del intent
        // todo se rellena con 0 por defecto hasta que se recoga algo
        if(imageResId !=0)
        {
            imageView.setImageResource(imageResId)
        }

    }
}