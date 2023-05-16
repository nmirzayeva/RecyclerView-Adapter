package com.nurlanamirzayeva.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val list:List<DTO>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.recycleview_item,parent,false)
        return MyViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem= list[position]

        holder.image.setImageResource(currentItem.imageResource)
        holder.name.text=currentItem.text1
        holder.point.text=currentItem.text2.toString()


    }
    override fun getItemCount()= list.size



    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: ImageView= itemView.findViewById(R.id.imageView)
        val name: TextView= itemView.findViewById(R.id.tw1)
        val point: TextView= itemView.findViewById(R.id.tw2)

    }
}