package com.example.lukasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var inputEmail: EditText
    private lateinit var inputPassword: EditText
    private lateinit var loginButton: Button
    private lateinit var registrationButton: Button
    private lateinit var passwordResetButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputEmail = findViewById(R.id.signInEmailEditText)
        inputPassword = findViewById(R.id.signInPasswordEditText)
        loginButton = findViewById(R.id.signInButton)
        registrationButton = findViewById(R.id.gotoRegistrationButton)
        passwordResetButton = findViewById(R.id.gotoPasswordResetButton)

        loginButton.setOnClickListener {
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()

            if(email.isEmpty() || password.isEmpty())
                Toast.makeText(, this,"Empty!", Toast.LENGTH_SHORT).show()
        }else  {
            //ToDO
        }
        registrationButton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity2::class.java))



        }
        passwordResetButton.setOnClickListener {
            //ToDo

        }
    }
}