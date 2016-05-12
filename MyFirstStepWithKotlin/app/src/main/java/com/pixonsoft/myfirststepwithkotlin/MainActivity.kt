package com.pixonsoft.myfirststepwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvHello = findViewById(R.id.tvHello) as TextView
        tvHello.text = "Hello World Kotlin Android"
    }
}
