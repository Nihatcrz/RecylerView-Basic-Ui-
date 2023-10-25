package com.example.recyclerviewogreniyorum

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewogreniyorum.databinding.ItemBinding

class Adapterolustur(val liste: ArrayList<Takimolustur>):RecyclerView.Adapter<Adapterolustur.MyView>() {

    inner class MyView(val itemBinding: ItemBinding):RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        return MyView(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return liste.size
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.itemBinding.imageView.setImageResource(liste[position].foto)
        holder.itemBinding.textView.text = liste[position].name
    }
}