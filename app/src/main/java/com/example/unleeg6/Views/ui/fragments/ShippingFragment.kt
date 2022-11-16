package com.example.unleeg6.Views.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.unleeg6.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.views.MapView
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.overlay.Marker

class ShippingFragment : Fragment(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap

    lateinit var map: MapView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_shipping, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      /*  val mapFragment= childFragmentManager.findFragmentById(R.id.mapGoogle) as SupportMapFragment
        mapFragment.getMapAsync(this)*/

        //Open Street Map
        map= view.findViewById(R.id.mapOpen)
        map.setTileSource(TileSourceFactory.MAPNIK)

        // Localización
        val lat= 5.070275
        val long= -75.513817
        val geoPoint= GeoPoint(lat,long)
        val mapController= map.controller
        mapController.setZoom(16.0)
        mapController.setCenter(geoPoint)
        //marcador
        val marker= Marker(map)
        marker.setPosition(geoPoint)
        marker.setAnchor(Marker.ANCHOR_CENTER,Marker.ANCHOR_BOTTOM)
        marker.setTitle("UnLeeG6")
        map.overlays.add(marker)

    }

    override fun onMapReady(googleMap: GoogleMap) {

        // Add a marker in Colombia and move the camera
      /*  val colombia = LatLng(5.070275,-75.513817)
        googleMap?.let {
            this.mMap=it
            googleMap.addMarker(MarkerOptions().position(colombia))
        }*/
     }



}