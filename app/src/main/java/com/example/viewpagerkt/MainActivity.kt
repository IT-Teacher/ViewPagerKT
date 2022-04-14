package com.example.viewpagerkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.demokotlinproject.adapter.ViewPagerAdapter
import com.example.demokotlinproject.fragments.PageOneFragment
import com.example.demokotlinproject.fragments.PageThirdFragment
import com.example.demokotlinproject.fragments.PageTwoFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity(){
    val TAG = MainActivity::class.java.toString()

    private var viewPagerAdapter: ViewPagerAdapter? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        viewPager = findViewById(R.id.viewpager)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPagerAdapter!!.add(PageOneFragment(), "User")
        viewPagerAdapter!!.add(PageThirdFragment(), "Contact")
        viewPagerAdapter!!.add(PageTwoFragment(), "Post")

        viewPager!!.setAdapter(viewPagerAdapter)

        tabLayout = findViewById(R.id.tab_layout)
        tabLayout!!.setupWithViewPager(viewPager)
    }
}