package com.example.recyclermvc

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val context: Context, val model: List<Model>) :
    RecyclerView.Adapter<Adapter.ViewHolders>() {


    class ViewHolders(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = itemView.findViewById(R.id.titlee)
        val image: ImageView = itemView.findViewById(R.id.imageview)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolders {
        val view = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return ViewHolders(view)
    }

    override fun onBindViewHolder(holder: ViewHolders, position: Int) {
        holder.title.text = model[position].title
        holder.image.setImageResource(model[position].image)

        holder.itemView.setOnClickListener {

            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return model.size
    }
}