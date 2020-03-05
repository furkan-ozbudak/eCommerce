package com.furkan.ecommerce

import java.io.Serializable

class Product : Serializable {
    var itemid: String
    var color: String
    var title: String
    var desc: String
    var image: String
    var price : Double = 0.0

    constructor(title:String, color:String, image:String, itemid:String, desc:String, price:Double) {
        this.itemid = itemid
        this.title = title
        this.color = color
        this.desc = desc
        this.image = image
        this.price = price
    }
}