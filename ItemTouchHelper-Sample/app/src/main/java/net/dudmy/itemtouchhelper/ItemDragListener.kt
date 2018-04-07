package net.dudmy.itemtouchhelper

import android.support.v7.widget.RecyclerView

interface ItemDragListener {
    fun onStartDrag(viewHolder: RecyclerView.ViewHolder)
}