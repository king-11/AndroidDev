package com.example.colormyviews

import android.R.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(boxOne, boxTwo, boxThree, boxFour, boxFive, constraintLayout, redButton, greenButton, yellowButton)

        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.boxOne -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwo -> view.setBackgroundColor(Color.GRAY)

            R.id.boxThree -> view.setBackgroundResource(color.holo_blue_dark)
            R.id.boxFour -> view.setBackgroundResource(color.holo_blue_light)
            R.id.boxFive -> view.setBackgroundResource(color.holo_blue_bright)

            R.id.greenButton -> boxFive.setBackgroundResource(R.color.my_green)
            R.id.redButton -> boxThree.setBackgroundResource(R.color.my_red)
            R.id.yellowButton -> boxFour.setBackgroundResource(R.color.my_yellow)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
