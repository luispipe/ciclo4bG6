package com.example.unleeg6.Views.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.unleeg6.R
import com.example.unleeg6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Asociar el activity a un layout
        //setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Configuración para que la animación funcione
        //binding.animationView.setAnimation(R.raw.book_animation)
        binding.animationView.playAnimation()
        //Trancisión entre la animación y la siguiente activity (4S)
    }
}

