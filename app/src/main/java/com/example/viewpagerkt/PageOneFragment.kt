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
import com.example.viewpagerkt.adapter.UserAdapter
import com.example.viewpagerkt.model.User

class PageOneFragment : Fragment() {
    var users: ArrayList<User> = ArrayList<User>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val userrec = view.findViewById<RecyclerView>(R.id.userrec)
        userrec.setHasFixedSize(true)
        userrec.setLayoutManager(GridLayoutManager(context, 1))





        users.add(User("Aliyev Ali", R.drawable.img1))
        users.add(User("Qodirova Ra'no", R.drawable.img2))
        users.add(User("Toxirov Alisher", R.drawable.img3))
        users.add(User("Azizov Salim", R.drawable.img4))
        users.add(User("Komolov Umid", R.drawable.img5))
        users.add(User("Usmonov Rustam", R.drawable.img6))
        users.add(User("Zoitov Shavkat", R.drawable.img7))
        users.add(User("Aliyeva Umida", R.drawable.img8))
        users.add(User("Shokirova Xadicha", R.drawable.img9))
        users.add(User("Jumayev Doniyor", R.drawable.img1))
        users.add(User("Qodirova Ra'no", R.drawable.img2))
        users.add(User("Toxirov Alisher", R.drawable.img3))
        users.add(User("Azizov Salim", R.drawable.img4))

        userrec.adapter = UserAdapter( users)


        return view

    }
}