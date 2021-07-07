package com.example.recyclermvc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

lateinit var textView: TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.secondText)


        val title = intent.getParcelableExtra<Model>("title")

        textView.text = title.toString()



    }
}