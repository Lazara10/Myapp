package com.example.lukasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_register2.view.*

class RegisterActivity2 : AppCompatActivity() {
    private lateinit var inputEmail: EditText
    private lateinit var inputPassword: EditText
    private lateinit var registrationButton: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)
        mAuth = FirebaseAuth.getInstance()

        inputEmail = findViewById(R.id.SignUpEmaieditText)
        inputPassword = findViewById(R.id.SignUpPasswordEditText)
        registrationButton = findViewById(R.id.SignUpButton)

        registrationButton.setOnClickListener {
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,, "Empty", Toast.LENGTH_SHORT).show() )
                } else {
                mAuth.createUserWithEmailAndPassword(email, password).addOnCanceledListener { task ->
                }
                    if(task.isSuccesful) {
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                        else{
                            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show()
                        }
                }

                    }
            }
        }
    }
}