package com.furkan.ecommerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_clothing.*

class ClothingActivity : AppCompatActivity() {
    var items = arrayOf<String>("shirt", "t-shirt", "shoes", "watch", "pants")
    var descriptions = arrayOf("Fancy, blue shirt", "Comfortable, black t-shirt",
        "Classical, man shoes", "Fashionable, leather watch", "Casual, green pants")
    var prices = arrayOf(30.0, 20.0, 60.0, 70.0, 35.0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothing)

        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            items
        )
        listView.adapter = adapter

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                var toast = Toast.makeText(
                    this,
                    "Description: ${descriptions[position]} \nPrice: $${prices[position]}", Toast.LENGTH_SHORT
                )
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show()
            }
    }
}
