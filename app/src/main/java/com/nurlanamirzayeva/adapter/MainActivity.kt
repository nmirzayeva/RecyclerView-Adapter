package com.nurlanamirzayeva.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {




    val list= mutableListOf(
        DTO(R.drawable.first,"The Shawshank Redemption",9.2),
        DTO(R.drawable.second,"The Godfather",9.2),
        DTO(R.drawable.third," The Dark Knight ",9.0),
        DTO(R.drawable.fourth,"The Godfather Part II",9.0),
        DTO(R.drawable.fifth,"12 Angry Men",9.0),


        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter= MyAdapter(list)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }



}