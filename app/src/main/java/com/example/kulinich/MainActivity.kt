package com.example.kulinich

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    var animals = ArrayList<Animal>()
    lateinit var adapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rV_on_main_activity)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        var bear = Animal ("Misha", "Bear", getString(R.string.description_of_bear) , R.drawable.bear)
        var fox = Animal ("Liza", "Fox", getString(R.string.description_of_fox),R.drawable.fox)
        var wolf = Animal("Sirko", "Wolf", getString(R.string.description_of_wolf),R.drawable.wolf)

        animals.add(bear)
        animals.add(fox)
        animals.add(wolf)

        adapter= AnimalAdapter(animals, this)

        recyclerView.adapter = adapter

    }
}