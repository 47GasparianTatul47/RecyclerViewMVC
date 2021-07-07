package com.example.recyclermvc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var recyclerView: RecyclerView
lateinit var list: List<Model>
lateinit var adapter: Adapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        list = listOf(
            Model(R.drawable.ic_launcher_background, "Android"),
            Model(R.drawable.ic_launcher_background, "Java"),
            Model(R.drawable.ic_launcher_background, "Kotlin"),
            Model(R.drawable.ic_launcher_background, "PHP"),
            Model(R.drawable.ic_launcher_background, "C++"),
            Model(R.drawable.ic_launcher_background, "C#")
        )
        adapter = Adapter(this, list)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}