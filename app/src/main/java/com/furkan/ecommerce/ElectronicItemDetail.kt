package com.furkan.ecommerce

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_electronic_item_detail.*

class ElectronicItemDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electronic_item_detail)

        // To avoid application crash check intent has data or not
        if(intent.hasExtra("image") && intent.hasExtra("product")){
            var ig =intent.getIntExtra("image",0)
//            var t1 = intent.getStringExtra("name")
//            var t2 = intent.getStringExtra("detail")
            var product = intent.getSerializableExtra("product") as Product
            tvTitle.text = product.title
            tvColor.text = "Color : " + product.color
            tvDescription.text = product.desc
            tvItemId.text = "Walmart #: " + product.itemid


            imageView.setImageResource(ig)
        }
    }
}
