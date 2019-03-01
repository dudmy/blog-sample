package net.dudmy.viewpager2sample

import android.view.View
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val textView: TextView = itemView.findViewById(R.id.page_name)

    fun bind(@ColorRes bgColor: Int, position: Int) {
        textView.text = "RecyclerViewAdapter\nPage $position"
        itemView.setBackgroundColor(ContextCompat.getColor(itemView.context, bgColor))
    }
}