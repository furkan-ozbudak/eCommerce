package com.furkan.ecommerce

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(var context:Context, var products :ArrayList<Product>, var img:IntArray) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.im.setImageResource(img[position])
        holder.t1.text = products.get(position).title
        holder.t2.text = "$" + products.get(position).price.toString()
        holder.t3.text = products.get(position).color


        holder.parentlayout.setOnClickListener {
            val intent = Intent(context, ElectronicItemDetail::class.java)
            intent.putExtra("image", img[position])
            intent.putExtra("product", products[position])
            context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.card_layout, parent, false)
        return MyViewHolder(v);
    }
    override fun getItemCount(): Int {
        return products.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var t1: TextView = itemView.findViewById<TextView>(R.id.tv1)
        var t2: TextView = itemView.findViewById<TextView>(R.id.tv2)
        var t3: TextView = itemView.findViewById<TextView>(R.id.tv3)
        var im : ImageView = itemView.findViewById<ImageView>(R.id.imageView)
        var parentlayout : LinearLayout = itemView.findViewById(R.id.playout) as LinearLayout
    }

}