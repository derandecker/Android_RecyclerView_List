package com.derandecker.galleryapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.derandecker.galleryapp.R
import com.derandecker.galleryapp.model.GroupOfImages
import kotlinx.android.synthetic.main.recycler_image_layout.view.*

class ImageListAdapter(val imageList: MutableList<GroupOfImages>) :
    RecyclerView.Adapter<ImageListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.rv_image_view
        //future implementation:
        //val imageName: TextView = view.rv_image_name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.recycler_image_layout, parent, false)
        return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageDrawable(imageList[position].image)
        //future implementation:
        //holder.imageName.text = imageList[position].imageName
    }


}