package com.furkan.ecommerce

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ElectronicActivity : AppCompatActivity() {
    var products = ArrayList<Product>()

    var r1: RecyclerView? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var s1 : Array<String>?=null
    var s2 : Array<String>?=null
    var s3 : Array<String>?=null
    var s4 : ArrayList<String>?=null
    var madr : MyAdapter?=null
    var images = intArrayOf(
        R.drawable.phone,
        R.drawable.laptop,
        R.drawable.monitor,
        R.drawable.tablet,
        R.drawable.tv
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electronic)

        products.add(Product("phone","black","", "1", "Fast smartphone",  300.0))
        products.add(Product("laptop","gray","", "2", "Casual laptop",  500.0))
        products.add(Product("monitor","black","", "3", "Full HD Monitor",  200.0))
        products.add(Product("tablet","white","", "4", "Casual tablet",  250.0))
        products.add(Product("tv","black","", "5", "55 inch TV",  450.0))





        r1 = findViewById<RecyclerView>(R.id.rv)
        s1 = arrayOf("1","2","3","4","5");
        s2 = arrayOf("a","b","c","d","e");
        s3 = arrayOf("aaa","bbb","ccc","ddd","eee");
        madr = MyAdapter(this,products, images)
        layoutManager = LinearLayoutManager(this)
        r1?.layoutManager = layoutManager
        r1?.adapter = madr
    }
}
