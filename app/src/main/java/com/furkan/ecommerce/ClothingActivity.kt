package com.furkan.ecommerce

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_clothing.*

class ClothingActivity : AppCompatActivity() {
    var images = intArrayOf(
        R.drawable.shirt, R.drawable.tshirt, R.drawable.shoes, R.drawable.watch,
        R.drawable.pant
    )
    var items = arrayOf<String>(
        "Shirt",
        "T-Shirt",
        "Shoes",
        "Watch",
        "Pant"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothing)

        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            items
        )
        listView.adapter = adapter
    }
}
