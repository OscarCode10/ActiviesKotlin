package com.oscarcode10.activieskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.editTextName)
        val email = findViewById<EditText>(R.id.editTextEmail)
        val pswd = findViewById<EditText>(R.id.editTextPswd)
        val btnLogin = findViewById<Button>(R.id.buttonLogin)

        val oscar = User("$name", "$email", "$pswd")
        btnLogin.setOnClickListener {
            if (oscar.login().equals("Puede ingresar")) {
                Toast.makeText(this, "Puede ingresar ${oscar.show()}", Toast.LENGTH_LONG)
            } else{
                Toast.makeText(this, "No puede ingresar", Toast.LENGTH_LONG)
            }
        }
    }
}