package com.example.viewpager.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.MainActivity
import com.example.viewpager.fragments.Fragment1
import com.example.viewpager.fragments.Fragment2
import com.example.viewpager.fragments.Fragment3

class MyFragmentStateAdapter(mainActivity: MainActivity)
    : FragmentStateAdapter(mainActivity)
{

    private val fragmentSize = 3

    override fun getItemCount(): Int {
        return this.fragmentSize
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> {
                return Fragment1()
            }
            1 -> {
                return Fragment2()
            }
            2 -> {
                return Fragment3()
            }
        }
        return Fragment1()
    }

}