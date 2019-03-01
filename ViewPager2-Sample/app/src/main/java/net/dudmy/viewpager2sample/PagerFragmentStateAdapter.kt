package net.dudmy.viewpager2sample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerFragmentStateAdapter(private val bgColors: List<Int>, fm: FragmentManager) : FragmentStateAdapter(fm) {

    override fun getItem(position: Int): Fragment =
            PagerFragment.newInstance(bgColors[position], position)

    override fun getItemCount(): Int = bgColors.size
}