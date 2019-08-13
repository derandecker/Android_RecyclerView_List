package com.derandecker.galleryapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ivList = mutableListOf<ImageView>()

        ivList.add(0, ImageView(this))
        ivList[0].setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693)
        )

        ivList.add(1, ImageView(this))
        ivList[1].setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092)
        )

        ivList.add(2, ImageView(this))
        ivList[2].setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847)
        )

        ivList.add(3, ImageView(this))
        ivList[3].setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285)
        )

        ivList.add(4, ImageView(this))
        ivList[4].setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653)
        )

        ivList.add(5, ImageView(this))
        ivList[5].setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105)
        )

        ivList.add(6, ImageView(this))
        ivList[6].setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011)
        )

        ivList.add(7, ImageView(this))
        ivList[7].setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148)
        )

        ivList.add(8, ImageView(this))
        ivList[8].setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168)
        )

        ivList.add(9, ImageView(this))
        ivList[9].setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965)
        )



        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        ivList.forEachIndexed { index, iv ->
            iv.layoutParams = layoutParams
            iv.adjustViewBounds = true
            iv.setPadding(5, 5, 5, 5)
            if (index % 2 == 0) {
                left_column.addView(iv)
            } else {
                right_column.addView(iv)
            }

            iv_left_column.contentDescription = getString(R.string.alleyway)
        }

//        <style name="ImageStyle">
//        <item name="android:padding">5dp</item>
//        <item name="android:layout_width">match_parent</item>
//        <item name="android:layout_height">wrap_content</item>
//        <item name="android:adjustViewBounds">true</item>
//        </style>

    }
}
