package com.example.unleeg6.Views.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unleeg6.R
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.ktx.Firebase
import com.google.firebase.database.FirebaseDatabase

class SignUpActivity: AppCompatActivity(){
    lateinit var home: Button
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var dbReference: DatabaseReference
    lateinit var database:FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        firebaseAuth= Firebase.auth
        database= FirebaseDatabase.getInstance()
        dbReference= database.reference.child("User")
        home= findViewById(R.id.register)
        val name= findViewById<EditText>(R.id.signupName)
        val email= findViewById<EditText>(R.id.signupEmail)
        val birthday= findViewById<EditText>(R.id.signupBirthday)
        val password= findViewById<EditText>(R.id.signupPassword)
        home.setOnClickListener {
            createUser(email.text.toString(),password.text.toString(),
                name.text.toString(),birthday.text.toString())
        }
    }
    private fun createUser(email:String, password:String, name:String, birthday:String){
        firebaseAuth.createUserWithEmailAndPassword(email,password).
        addOnCompleteListener(this){
            Task->if (Task.isSuccessful){
                val user=firebaseAuth.currentUser
                val userdb= dbReference.child(user?.uid.toString())
                userdb.child("name").setValue(name)
                userdb.child("birthday").setValue(birthday)

                startActivity(Intent(this,LoginActivity::class.java))
            }
            else{
                Toast.makeText(applicationContext,"No se puede registrar este usuario",Toast.LENGTH_LONG).show()

            }
        }
    }
}