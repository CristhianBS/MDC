package com.cbernals.practicemdc1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.cbernals.practicemdc1.R
import com.cbernals.practicemdc1.utils.Shot
import com.cbernals.practicemdc1.utils.Utils

class ShotAdapter(val shotsList: List<Shot>) : RecyclerView.Adapter<ShotAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val shotImage = view.findViewById<ImageView>(R.id.img_shot)
        val shotColor = view.findViewById<CardView>(R.id.cardView_shot)

        fun render(shot: Shot){
            shotImage.setImageResource(shot.image)
            shotColor.setCardBackgroundColor(Utils.getColorFromString(shot.color))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_shots, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = shotsList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = shotsList.size
}