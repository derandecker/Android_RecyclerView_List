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
            ivList.add(0, GroupOfImages(dImage, "Adventure Automobile"))
        }

        dImage = ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693)
        if (dImage != null) {
            ivList.add(0, GroupOfImages(dImage, "Abstract Expressionism"))
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
