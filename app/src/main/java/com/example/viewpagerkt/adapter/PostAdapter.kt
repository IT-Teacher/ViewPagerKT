package com.example.viewpagerkt.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerkt.R
import com.example.viewpagerkt.model.Post
import com.example.viewpagerkt.model.User

class PostAdapter(val posts: ArrayList<Post>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_post_list, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post = posts[position]

        if (holder is PostViewHolder) {
            val tv_title = holder.tv_title
            val tv_desc = holder.tv_desc
            val iv_post = holder.iv_post

            iv_post.setImageResource(post.img)
            tv_title.setText(post.title)
            tv_desc.setText(post.desc)
        }
    }

    class PostViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var tv_title: TextView
        var tv_desc: TextView
        var iv_post: ImageView

        init {
            iv_post = view.findViewById(R.id.iv_post)
            tv_title = view.findViewById(R.id.tv_title)
            tv_desc = view.findViewById(R.id.tv_desc)
        }
    }
}