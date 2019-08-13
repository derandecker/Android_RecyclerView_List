package com.derandecker.galleryapp.ui

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.derandecker.galleryapp.R
import com.derandecker.galleryapp.adapter.ImageListAdapter
import com.derandecker.galleryapp.model.GroupOfImages
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ivList = mutableListOf<GroupOfImages>()
        var dImage: Drawable? = ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092)


        if (dImage != null) {
            ivList.add(GroupOfImages(dImage, "Adventure Automobile"))
        }

        dImage = ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693)
        if (dImage != null) {
            ivList.add(GroupOfImages(dImage, "Abstract Expressionism"))
        }

        dImage = ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847)
        if (dImage != null) {
            ivList.add(GroupOfImages(dImage, "Aerial Photography"))
        }

        dImage = ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285)
        if (dImage != null) {
            ivList.add(GroupOfImages(dImage, "Afterglow Beach Cliff"))
        }

        dImage = ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517)
        if (dImage != null) {
            ivList.add(GroupOfImages(dImage, "Alley and Buildings"))
        }

        dImage = ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653)
        if (dImage != null) {
            ivList.add(GroupOfImages(dImage, "Architecture"))
        }

        dImage = ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105)
        if (dImage != null) {
            ivList.add(GroupOfImages(dImage, "Breathtaking Canada"))
        }


        rv_layout.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ImageListAdapter(ivList)
        rv_layout.layoutManager = manager
        rv_layout.adapter = adapter


//      /CODE FROM PREVIOUS ITERATION OF PROJECT/
//        val layoutParams = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.MATCH_PARENT,
//            ViewGroup.LayoutParams.WRAP_CONTENT
//        )

//      /CODE FROM PREVIOUS ITERATION OF PROJECT/
//        ivList.forEachIndexed { index, iv ->
//            iv.layoutParams = layoutParams
//            iv.adjustViewBounds = true
//            iv.setPadding(5, 5, 5, 5)
//            if (index % 2 == 0) {
//                left_column.addView(iv)
//            } else {
//                right_column.addView(iv)
//            }
//
//            iv_left_column.contentDescription = getString(R.string.alleyway)
//        }

    }
}
