package com.dicoding.nodapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.iv_icon)
        val name: TextView = itemView.findViewById(R.id.tv_name)
        val rating: TextView = itemView.findViewById(R.id.tv_rating)
        val star: ImageView = itemView.findViewById(R.id.iv_star)
        val distance: TextView = itemView.findViewById(R.id.tv_distance)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.destination_list_item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.icon.setImageResource(item.iconResId)
        holder.name.text = item.name
        holder.rating.text = item.rating.toString()
        holder.distance.text = item.distance
    }

    override fun getItemCount(): Int = itemList.size
}

data class Item(val iconResId: Int, val name: String, val rating: Float, val distance: String)




