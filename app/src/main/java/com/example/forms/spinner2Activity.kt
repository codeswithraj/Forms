package com.example.forms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class spinner2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner2)
        val languages = arrayOf<String>("C","C++","Kotlin","Java")

        val spinner= findViewById<Spinner>(R.id.spinner)

        val adapter = ArrayAdapter(this,R.layout.spindesign, languages)
        spinner.adapter = adapter
    }
}