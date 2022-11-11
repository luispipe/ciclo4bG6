package com.example.unleeg6.Views.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unleeg6.R
import com.example.unleeg6.ViewModels.booksViewModel
import com.example.unleeg6.Views.adapter.BookAdapter


class BooksFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: BookAdapter
    val viewmodel by lazy { ViewModelProvider(this).get(booksViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_books, container, false)
        recyclerView= view.findViewById(R.id.rvBooks)
        adapter= BookAdapter(requireContext())
        recyclerView.layoutManager=LinearLayoutManager(context)
        recyclerView.adapter=adapter
        observeData()
        return view
    }

    fun observeData(){
        viewmodel.fetchBookData().observe(viewLifecycleOwner, Observer{
            adapter.setListData(it)
            adapter.notifyDataSetChanged()
        })
    }


}