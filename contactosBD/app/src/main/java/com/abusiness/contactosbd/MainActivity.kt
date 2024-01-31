package com.abusiness.contactosbd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var emailEditText:EditText
    private lateinit var salvar:Button
    private lateinit var db:DatabaseHander
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameEditText = findViewById(R.id.editTextText)
        emailEditText = findViewById(R.id.editTextText2)
        salvar = findViewById(R.id.button)

        db= DatabaseHander(this)  // todo instancia la clase DatabaseHander
        salvar.setOnClickListener {
            val name = nameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            if  (name.isNotEmpty() && email.isNotEmpty()){
                val id=db.addContact(name,email)
                if (id == -1L){
                    nameEditText.text.clear()
                    emailEditText.text.clear()
                }
                    else{
                        // todo aqui iria un toast avisando de error
                    Toast.makeText(applicationContext, "guardado", Toast.LENGTH_SHORT).show()
                    }
            }else{
                // todo ha habido un problema en la base de datos
               Toast.makeText(applicationContext, "te falta algun campo", Toast.LENGTH_SHORT).show()
            }
        }

    }
}