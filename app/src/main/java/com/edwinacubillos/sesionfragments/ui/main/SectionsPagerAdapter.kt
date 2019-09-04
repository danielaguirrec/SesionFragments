package com.edwinacubillos.sesionfragments.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.edwinacubillos.sesionfragments.*

private val TAB_TITLES = arrayOf(
    R.string.superman,
    R.string.batman,
    R.string.flash
)

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    fun getUserData(userList: ArrayList<User>){
        this.userList = userList
    }

    private var userList: ArrayList<User> = ArrayList()

    override fun getItem(position: Int): Fragment {

        when (position){
            0 -> return FormFragment()
            1 -> return BatmanFragment()
            else -> return DatosFragment.newInstance(userList)
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}