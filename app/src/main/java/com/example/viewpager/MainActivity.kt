package com.example.viewpager

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.adapters.MyFragmentStateAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var myFragmentStateAdapter: MyFragmentStateAdapter
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)
        myFragmentStateAdapter = MyFragmentStateAdapter(this)

        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = myFragmentStateAdapter
    }
}