package com.furkan.ecommerce

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ClothingAdapter(var contex:Context, var resources:Int, var items:List<ClothingItem>)
    : ArrayAdapter<ClothingItem>(contex, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup):View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(contex)
        val view: View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.image)
        val titleTextView:TextView = view.findViewById(R.id.textView)
        val descriptionTextView:TextView = view.findViewById(R.id.textView)

        var mItem:ClothingItem = items[position]
        imageView.setImageDrawable(contex.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        descriptionTextView.text = mItem.description

        return view
    }

}