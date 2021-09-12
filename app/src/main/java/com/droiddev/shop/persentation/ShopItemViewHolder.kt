package com.droiddev.shop.persentation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.droiddev.shop.R

class ShopItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tv1 = view.findViewById<TextView>(R.id.tv_name)
    val tv2 = view.findViewById<TextView>(R.id.tv_count)
}