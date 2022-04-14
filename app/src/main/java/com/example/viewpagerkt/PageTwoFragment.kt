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
import com.example.viewpagerkt.adapter.PostAdapter
import com.example.viewpagerkt.model.Post
import com.example.viewpagerkt.model.User

class PageTwoFragment : Fragment() {
    var posts: ArrayList<Post> = ArrayList<Post>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val recyc = view.findViewById<RecyclerView>(R.id.postrec)
        recyc.setHasFixedSize(true)
        recyc.setLayoutManager(GridLayoutManager(context, 1))

        posts.add(Post("New Post1", R.drawable.news1,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"))
        posts.add(Post("New Post1", R.drawable.news2,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"))
        posts.add(Post("New Post1", R.drawable.news3,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"))
        posts.add(Post("New Post1", R.drawable.news1,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"))
        posts.add(Post("New Post1", R.drawable.news2,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"))
        posts.add(Post("New Post1", R.drawable.news3,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"))




        recyc.adapter = PostAdapter(posts)
        return view
    }
}