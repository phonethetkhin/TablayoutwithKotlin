package com.example.tablayoutwithkotlin

import android.graphics.pdf.PdfDocument
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.tablayoutwithkotlin.fragments.RemainFragments
import com.example.tablayoutwithkotlin.fragments.ScannedFragment
import com.example.tablayoutwithkotlin.fragments.UnknownFragment

class PagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position)
        {
            0->
            {
                RemainFragments()
            }
            1->
            {
                ScannedFragment()
            }
            2->
            {
                UnknownFragment()
            }
            else->
            {
                RemainFragments()
            }
        }


    }

    override fun getCount(): Int {
return 3
    }




}