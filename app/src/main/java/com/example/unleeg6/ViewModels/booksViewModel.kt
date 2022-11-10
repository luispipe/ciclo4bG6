package com.example.unleeg6.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.unleeg6.Domain.repository
import com.example.unleeg6.Models.books

class booksViewModel:ViewModel() {
    val repository= repository()
    fun fetchBookData():LiveData<MutableList<books>>{
        val mutableData= MutableLiveData<MutableList<books>>()
        repository.getBooksData().observeForever {
            mutableData.value = it
        }
        return mutableData
    }
}