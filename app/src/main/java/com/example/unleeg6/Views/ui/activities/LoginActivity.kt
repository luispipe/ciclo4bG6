package com.example.unleeg6.Views.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.unleeg6.databinding.ActivityMainBinding

class LoginActivity: AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}