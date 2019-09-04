package com.edwinacubillos.sesionfragments

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.edwinacubillos.sesionfragments.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout

//Swipe Tabs

class Main5Activity : AppCompatActivity(), comunicador {

    private lateinit var user: User
    var listUsers: ArrayList<User> = ArrayList()
    private lateinit var sectionsPagerAdapter: SectionsPagerAdapter

    override fun enviarDatos(nombre: String, cedula: String) {
        user = User(nombre, cedula)

        listUsers.add(user)

        sectionsPagerAdapter.getUserData(listUsers)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val viewPager: ViewPager = findViewById(R.id.view_pager)
        sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
    }
}
