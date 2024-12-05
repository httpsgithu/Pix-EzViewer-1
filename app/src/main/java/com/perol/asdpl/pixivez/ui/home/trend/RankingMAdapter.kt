/*
 * MIT License
 *
 * Copyright (c) 2020 ultranity
 * Copyright (c) 2019 Perol_Notsfsssf
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE
 */

package com.perol.asdpl.pixivez.ui.home.trend

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.perol.asdpl.pixivez.core.PicListFragment
import com.perol.asdpl.pixivez.core.TAG_TYPE
import com.perol.asdpl.pixivez.objects.WeakValueHashMap

class RankingMAdapter(fragment: Fragment, private val restrictLevel: Int = 0) :
    FragmentStateAdapter(fragment) {

    private val modeList = mutableListOf(
        "day", "day_male", "day_female", "day_ai", "week_original", "week_rookie", "week", "month",
        "day_manga"
    ).apply {
        if (restrictLevel <= 1) {
            addAll(listOf("day_r18", "day_male_r18", "day_female_r18", "week_r18"))
            if (restrictLevel == 0) add("week_r18g")
        }
    }


    override fun getItemCount() = modeList.size

    //TODO: LRU cache
    val fragments = WeakValueHashMap<Int, PicListFragment>(3)
    override fun createFragment(position: Int): Fragment {
        if (fragments[position] == null) {
            fragments[position] = PicListFragment.newInstance(
                TAG_TYPE.Rank.name, position, mutableMapOf(
                    "mode" to modeList[position]
                )
            )
        }
        return fragments[position]!!
    }
    /*    override fun getItemCount() = modelist.size
        override fun createFragment(position: Int) = RankingMFragment.newInstance(modelist[position])*/
}
