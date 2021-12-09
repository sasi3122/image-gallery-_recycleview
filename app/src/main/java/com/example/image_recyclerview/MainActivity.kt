package com.example.image_recyclerview

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val images = listOf<image>(
            image("Images 1",R.drawable.img_1),
            image("Images 2",R.drawable.img_2),
            image("Images 3",R.drawable.img_3),
            image("Images 4",R.drawable.img_4),
            image("Images 5",R.drawable.img_5)

        )









        val recyclerView = findViewById<RecyclerView>(R.id.imagesRecycverView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ImageAdapter(this,images)
    }
}