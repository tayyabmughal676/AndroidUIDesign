package com.example.mrtayyab.newuiux

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.ImageButton
import android.widget.CheckBox
import android.widget.EditText
import android.content.Intent
import com.example.mrtayyab.newuiux.R.id.signin
import android.widget.Toast
import com.example.mrtayyab.newuiux.R.id.signup
import com.example.mrtayyab.newuiux.R.id.email
import com.example.mrtayyab.newuiux.R.id.toolbar





class SginUpActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var email: EditText
    lateinit var password:EditText
    lateinit var name:EditText
    lateinit var checkBox: CheckBox
    lateinit var signup: ImageButton
    lateinit var signin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sgin_up)

        toolbar = findViewById(R.id.toolbar) as Toolbar



        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_black_24dp)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        name = findViewById(R.id.name)

        checkBox = findViewById(R.id.checkbox)

        signup = findViewById(R.id.signup)

        signin = findViewById(R.id.signin)

        signup.setOnClickListener {
            Toast.makeText(this, "Sign Up Button Clicked", Toast.LENGTH_LONG).show()

        }

        signin.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}
