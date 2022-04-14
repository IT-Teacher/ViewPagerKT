package com.example.viewpagerkt.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerkt.R

class ContactAdapter(var str: ArrayList<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return str.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return MemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = str[position]

        if (holder is MemberViewHolder) {
            val tv_fullname = holder.tv_fullname
            tv_fullname.setText(member)
        }
    }

    class MemberViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var tv_fullname: TextView

        init {
            tv_fullname = view.findViewById(R.id.tv_fullname)
        }
    }
}