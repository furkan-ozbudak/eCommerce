package com.furkan.ecommerce

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var userList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userList.add(User("furkan", "ozbudak", "fo", "1"))
        userList.add(User("ahmetcem", "kaya", "ak", "2"))
        userList.add(User("umur", "inan", "ui", "3"))
        userList.add(User("eren", "ozturk", "eo", "4"))
        userList.add(User("utku", "guleviz", "ug", "5"))
    }

    override fun onResume() {
        super.onResume()
        if (intent.getSerializableExtra("newUser") != null) {
            userList.add(intent.getSerializableExtra("newUser") as User)
        }
    }

    fun signInClicked(view: View) {
        var isFound = false
        for (user in userList) {
            if (user.username.equals((usernameTextBox.text).toString())) {
                if (user.password.equals((passwordTextBox.text).toString())) {
                    //login succesfull
                    isFound = true
                    val intent = Intent(this, ShoppingCategoryActivity::class.java)
                    intent.putExtra("username", user.username)
                    startActivity(intent)
                }
            }
        }
        if(isFound == false) {
            var toast = Toast.makeText(
                this,
                "Wrong login information given. Correct your email address or password.",
                Toast.LENGTH_SHORT
            )
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
    }

    fun signUpClicked(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    fun forgotPasswordClicked(view: View) {
        var isFound = false
        for (user in userList) {
            if (user.username.equals((usernameTextBox.text).toString())) {
                isFound = true
                val i = Intent(Intent.ACTION_SEND)
                i.type = "message/rfc822"
                i.putExtra(Intent.EXTRA_EMAIL, user.username)
                i.putExtra(Intent.EXTRA_SUBJECT, "Your Password")
                i.putExtra(Intent.EXTRA_TEXT, user.password)
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."))
                } catch (ex: ActivityNotFoundException) {
                    var toast = Toast.makeText(
                        this,
                        "There are no email clients installed.",
                        Toast.LENGTH_SHORT
                    )
                    toast.setGravity(Gravity.CENTER, 0, 0)
                    toast.show()
                }
            }
        }
        if(isFound == false) {
            var toast = Toast.makeText(
                this,
                "There is no such email address registered. Enter your email again.",
                Toast.LENGTH_SHORT
            )
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show()

        }
    }
}
