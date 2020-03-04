package com.furkan.ecommerce

import java.io.Serializable

class User : Serializable{
    lateinit var firstname: String
    lateinit var lastname: String
    lateinit var username: String
    lateinit var password: String

    constructor(firstname: String, lastname: String, username: String, password: String) {
        this.firstname = firstname
        this.lastname = lastname
        this.username = username
        this.password = password
    }



    constructor() {
    }
}