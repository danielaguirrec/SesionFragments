package com.edwinacubillos.sesionfragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.edwinacubillos.sesionfragments.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val viewPager: ViewPager = findViewById(R.id.view_pager)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)

        viewPager.adapter = sectionsPagerAdapter

        val tabs: TabLayout = findViewById(R.id.tabs)

        tabs.setupWithViewPager(viewPager)
    }
}
