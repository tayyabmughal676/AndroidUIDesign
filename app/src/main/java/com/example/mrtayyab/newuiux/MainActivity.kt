package com.example.mrtayyab.newuiux

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.ImageButton
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import android.R.attr.password
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var email: EditText
    lateinit var password:EditText
    lateinit var checkBox: CheckBox
    lateinit var signin: ImageButton
    lateinit var signup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_black_24dp)

        email = findViewById(R.id.email)
        password = (findViewById(R.id.password) as EditText)

        checkBox = findViewById(R.id.checkbox)

        signin = findViewById(R.id.signin)

        signup = findViewById(R.id.signup)

       signin.setOnClickListener {
           Toast.makeText(this@MainActivity, "Sign In Button Clicked", Toast.LENGTH_LONG).show()

       }


        signup.setOnClickListener {
            val  i = Intent(this,SginUpActivity::class.java)
            startActivity(i);
        }


    }

}
