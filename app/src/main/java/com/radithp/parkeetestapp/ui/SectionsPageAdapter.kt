package com.radithp.parkeetestapp.ui

import android.content.Context
import android.view.View
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.radithp.parkeetestapp.R
import com.radithp.parkeetestapp.ui.fragment.MoviePopularFragment

class SectionsPageAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.movies, R.string.tv_shows)
    }
    override fun getCount(): Int = 2
    override fun getPageTitle(position: Int): CharSequence? = mContext.resources.getString(TAB_TITLES[position])



    override fun getItem(position: Int): Fragment =
        when(position){
            0 -> MoviePopularFragment()
            else -> Fragment()
    }

}
