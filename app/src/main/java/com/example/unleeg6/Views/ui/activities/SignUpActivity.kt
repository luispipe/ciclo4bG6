package com.example.unleeg6.Views.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.unleeg6.R

class SignUpActivity: AppCompatActivity(){
    lateinit var home: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        home= findViewById(R.id.register)
        home.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}