package com.example.unleeg6.Domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.unleeg6.Models.books
import com.google.firebase.firestore.FirebaseFirestore

class repository {
    fun getBooksData():LiveData<MutableList<books>>{
        val mutableLiveData= MutableLiveData<MutableList<books>>()
        FirebaseFirestore.getInstance().collection("books").get().addOnSuccessListener {
            result -> val listData= mutableListOf<books>()
            for (document in result){
                val title= document.getString("title")
                val author= document.getString("author")
                val price= document.getLong("price")?.toInt()
                val url= document.getString("url")
                val book= books(title,author,price,url)
                listData.add(book)
            }
            mutableLiveData.value=listData
        }
        return mutableLiveData

    }
}