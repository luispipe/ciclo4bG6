package com.example.unleeg6.Views.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.unleeg6.Models.books
import com.example.unleeg6.R


class BookAdapter(val context: Context):RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    var bookList= mutableListOf<books>()

    fun setListData(data:MutableList<books>){
        bookList= data
    }

    override fun onCreateViewHolder(ViewGroup: ViewGroup, position: Int): ViewHolder {
        val v= LayoutInflater.from(ViewGroup.context).inflate(R.layout.card_view_book
        ,ViewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(itemView: ItemView): RecyclerView.ViewHolder(itemView){

    }


}