package com.example.viewpager

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.adapters.MyFragmentStateAdapter
import com.example.viewpager.adapters.TabLayoutFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var myFragmentStateAdapter: MyFragmentStateAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var tabLayoutFragmentAdapter: TabLayoutFragmentAdapter

    private val tabs = arrayOf("Play", "Phone", "WiFi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)

        myFragmentStateAdapter = MyFragmentStateAdapter(this)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = myFragmentStateAdapter

        tabLayout = findViewById(R.id.tab_layout)
        tabLayoutFragmentAdapter = TabLayoutFragmentAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = tabLayoutFragmentAdapter
        TabLayoutMediator(tabLayout, viewPager){
            tab, position -> tab.text = tabs[position]
        }.attach()

    }
}