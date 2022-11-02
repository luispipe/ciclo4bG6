package com.example.unleeg6.Views.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.example.unleeg6.R


class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cardBook= view.findViewById<CardView>(R.id.card_book)

        cardBook.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_booksFragment)
        }

        val cardShop= view.findViewById<CardView>(R.id.card_shopping)

        cardShop.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_shopFragment)
        }

        val cardFavorite= view.findViewById<CardView>(R.id.card_favorites)
        cardFavorite.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_favoritesFragment)
        }

        val cardProfile= view.findViewById<CardView>(R.id.card_profile)
        cardProfile.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_profileFragment)
        }

        val cardShip= view.findViewById<CardView>(R.id.card_shipping)
        cardShip.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_shippingFragment)
        }

        val cardHelp = view.findViewById<CardView>(R.id.card_help)
        cardHelp.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_helpFragment)
        }
    }


}