package com.example.calabe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val fragments = listOf(Fragment1(), Fragment2(), Fragment3())
        val titles = listOf("Expertises", "Réalisations", "Concept")
        val adapter = MyAdapter(supportFragmentManager, fragments, titles)

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
