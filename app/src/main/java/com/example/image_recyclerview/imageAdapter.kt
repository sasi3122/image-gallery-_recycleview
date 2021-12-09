package com.example.image_recyclerview

import android.content.Context
import android.media.Image
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (

    private val context : Context,
    private val images: List<image>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){

class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val img = itemView.findViewById<ImageView>(R.id.image)
    val imgTitle = itemView.findViewById<TextView>(R.id.image_title)
    fun bindView(image: image) {
        img.setImageResource(image.imageSrc)
        imgTitle.text = image.title
    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_images,parent,false))


    override fun getItemCount(): Int =images.size

    override fun onBindViewHolder(holder: ImageAdapter.ImageViewHolder, position: Int) {

        holder.bindView(images[position])

    }

    }