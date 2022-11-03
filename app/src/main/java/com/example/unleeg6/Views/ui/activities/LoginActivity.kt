package com.example.unleeg6.Views.ui.activities
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.unleeg6.R
import com.example.unleeg6.databinding.ActivityMainBinding
class LoginActivity: AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var signup: Button
    lateinit var home: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  binding= ActivityMainBinding.inflate(layoutInflater)
      //  setContentView(binding.root)
        setContentView(R.layout.activity_login)
        home= findViewById(R.id.login)
        signup= findViewById(R.id.signup)
        home.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        signup.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }

        val txtNewPass= findViewById<TextView>(R.id.textViewForgotPassword)
        txtNewPass.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }

    }
}