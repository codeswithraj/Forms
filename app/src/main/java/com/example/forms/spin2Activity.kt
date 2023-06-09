package com.example.forms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class spin2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spin2)
        val languages = arrayOf<String>("C","C++","Kotlin","Java")

        val spining = findViewById<Spinner>(R.id.spining)
        val adapter = ArrayAdapter(this,R.layout.spin, languages)
        spining.adapter = adapter
    }
}