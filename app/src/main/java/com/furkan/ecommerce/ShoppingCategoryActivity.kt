package com.furkan.ecommerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ShoppingCategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)
        welcomeUser.text = "welcome ${intent.getStringExtra("username")}"
    }

    fun onClothingClick(view: View) {
        var intent = Intent(applicationContext, ClothingActivity::class.java)
        startActivity(intent)
    }
}
