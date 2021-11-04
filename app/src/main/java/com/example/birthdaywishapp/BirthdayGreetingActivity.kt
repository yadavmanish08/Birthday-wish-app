package com.example.birthdaywishapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name=intent.getStringExtra("name")
        val birthdayGreeting= findViewById<TextView>(R.id.birthdayGreeting)
        birthdayGreeting.text="Happy Birthday $name"
    }
}