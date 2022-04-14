package com.example.viewpagerkt.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerkt.R
import com.example.viewpagerkt.model.User

class UserAdapter(val users: ArrayList<User>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_user_list, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = users[position]

        if (holder is UserViewHolder) {
            val iv_profile = holder.iv_profile
            val tv_fullname = holder.tv_fullname

            iv_profile.setImageResource(user.img)
            tv_fullname.setText(user.fullName)
        }
    }

    class UserViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var tv_fullname: TextView
        var iv_profile: ImageView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
        }
    }
}