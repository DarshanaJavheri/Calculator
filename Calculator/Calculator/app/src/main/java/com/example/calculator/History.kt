package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class History : AppCompatActivity() {
    private lateinit var textView : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        textView = findViewById(R.id.history)
        val numberList = intent.getSerializableExtra( "key" )
        println(numberList)
        textView.text = numberList.toString()
    }
}