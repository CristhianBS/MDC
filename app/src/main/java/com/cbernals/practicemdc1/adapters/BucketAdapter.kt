package com.cbernals.practicemdc1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.cbernals.practicemdc1.R
import com.cbernals.practicemdc1.models.Bucket
import com.cbernals.practicemdc1.utils.OnClickListener
import com.cbernals.practicemdc1.utils.Utils

class BucketAdapter(val bucketsList: List<Bucket>, val mListener: OnClickListener) :
    RecyclerView.Adapter<BucketAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val bucketText = view.findViewById<TextView>(R.id.text_bucket)
        val bucketColor = view.findViewById<CardView>(R.id.cardView_bucket)

        fun render(bucket: Bucket){
            bucketText.text = bucket.text
            bucketColor.setCardBackgroundColor(Utils.getColorFromString(bucket.color))
        }

        fun setClickListener(listener: OnClickListener, bucket: Bucket){
            view.setOnClickListener{
                listener.onClick(bucket)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_buckets, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = bucketsList[position]
        holder.render(item)
        holder.setClickListener(mListener, item)
    }

    override fun getItemCount(): Int = bucketsList.size
}