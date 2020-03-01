package com.furkan.ecommerce

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun onRegisterClick(view: View) {
        if(firstNameTextbox.toString() == null || firstNameTextbox.text.toString().trim() == "") {
            var toast = Toast.makeText(
                getApplicationContext(),
                "Please enter your first name.", Toast.LENGTH_SHORT
            )
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show()
        }
        else if(firstNameTextbox.toString() == null || lastNameTextbox.text.toString().trim() == "") {
            var toast = Toast.makeText(
                getApplicationContext(),
                "Please enter your last name.", Toast.LENGTH_SHORT
            )
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show()
        }
        else if(firstNameTextbox.toString() == null || emailTextbox.text.toString().trim() == "") {
            var toast = Toast.makeText(
                getApplicationContext(),
                "Please enter your email address.", Toast.LENGTH_SHORT
            )
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show()
        }
        else if(firstNameTextbox.toString() == null || passwordTextBox.text.toString().trim() == "") {
            var toast = Toast.makeText(
                getApplicationContext(),
                "Please enter your password.", Toast.LENGTH_SHORT
            )
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show()
        }
        else {
            var toast = Toast.makeText(
                getApplicationContext(),
                "Account created successfully.", Toast.LENGTH_SHORT
            )
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            object : CountDownTimer(2000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                }

                override fun onFinish() {
                    var intent = Intent(applicationContext, MainActivity::class.java)
                    val newUser = User(
                        firstNameTextbox.text.toString(),
                        lastNameTextbox.text.toString(), emailTextbox.text.toString(),
                        passwordTextBox.text.toString()
                    )
                    intent.putExtra("newUser", newUser)

                    startActivity(intent)
                }
            }.start()
        }
    }


}
