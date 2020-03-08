package com.example.tablayoutwithkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter=PagerAdapter(supportFragmentManager)
        vpgMain.adapter=adapter

        vpgMain.addOnPageChangeListener(TabLayoutOnPageChangeListener(tblScan))
        supportActionBar!!.title = "Remain"
        tblScan.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                vpgMain.setCurrentItem(tab.position)
                var title = ""
                when (tab.position) {
                    0 -> title = "Remain"
                    1 -> title = "Scanned"
                    2 -> title = "Unknown"
                }
                supportActionBar!!.setTitle(title)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }
    }

