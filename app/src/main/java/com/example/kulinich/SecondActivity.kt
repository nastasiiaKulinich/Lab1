package com.example.kulinich

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var animalName : TextView
    lateinit var description: TextView
    lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        animalName = findViewById(R.id.name_second_activity)
        description = findViewById(R.id.full_desc_second_activity)
        image = findViewById(R.id.image_second_activity)

        animalName.text = intent.getStringExtra("passingName")
        description.text = intent.getStringExtra("passingFullDesc")

        when(animalName.text){
            "Misha" -> image.setImageResource(R.drawable.bear)
            "Liza" -> image.setImageResource(R.drawable.fox)
            "Sirko" -> image.setImageResource(R.drawable.wolf)
        }

    }
}