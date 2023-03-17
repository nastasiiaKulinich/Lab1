package com.example.kulinich

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter (var animals : ArrayList<Animal>,
var context: Context) :RecyclerView.Adapter <AnimalAdapter.AnimalViewHolder>() {

    class AnimalViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var textViewAnimalName : TextView = itemView.findViewById(R.id.name_on_card)
        var textViewAnimalShortDescription : TextView = itemView.findViewById(R.id.short_description_on_card)
        var imageView : ImageView = itemView.findViewById(R.id.image_card)
        var button : Button = itemView.findViewById(R.id.button_on_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_animal,parent,false)

        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.textViewAnimalName.text = animals.get(position).name
        holder.textViewAnimalShortDescription.text = animals.get(position).animal
        holder.imageView.setImageResource(animals.get(position).picture)

        holder.button.setOnClickListener {
            var passingName : String = animals.get(position).name
            var passingFullDesc : String = animals.get(position).description

            var intent = Intent (context, SecondActivity::class.java)

            intent.putExtra("passingName",passingName)
            intent.putExtra("passingFullDesc", passingFullDesc)

            context.startActivity(intent)

        }

    }

}