package com.example.demokotlinproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerkt.R
import com.example.viewpagerkt.adapter.ContactAdapter

class PageThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false);
        val recyc = view.findViewById<RecyclerView>(R.id.recyc)
        recyc.setHasFixedSize(true)
        recyc.setLayoutManager(GridLayoutManager(context, 1))
        val str: ArrayList<String> = java.util.ArrayList<String>()
        str.add( "Salim")
        str.add( "Ali")
        str.add( "Davron")
        str.add( "Olim")
        str.add( "Qosim")
        str.add( "Diyor")
        str.add( "Bobur")

        recyc.adapter = ContactAdapter( str)
        return view;
    }
}