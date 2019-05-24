package com.example.diceroller

import android.databinding.DataBindingUtil
import android.graphics.Color
import android.os.Bundle
import android.view.View
import com.example.diceroller.databinding.ActivityColorMyViewBinding
import kotlinx.android.synthetic.main.activity_color_my_view.*

class ColorMyView : BaseActivity() {

    private lateinit var binding: ActivityColorMyViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_color_my_view)

        initListeners()
    }

    override fun initData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initListeners() {
        val clickableViews: List<View> =
            listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text)
        for (item in clickableViews) {
            item.setOnClickListener { onClick(it) }
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
