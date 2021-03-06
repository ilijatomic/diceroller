package com.example.diceroller

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.View
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initListeners()
    }

    override fun initData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initListeners() {
        binding.apply {
            aboutMeButton.setOnClickListener { onClick(it) }
            rollButton.setOnClickListener { onClick(it) }
            colorMyViewButton.setOnClickListener { onClick(it) }
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.roll_button -> rollDice()
            R.id.about_me_button -> startAboutMe()
            R.id.color_my_view_button -> startColorMyView()
        }
    }

    private fun startColorMyView() {
        val intent = Intent(this, ColorMyView::class.java)
        startActivity(intent)
    }

    private fun startAboutMe() {
        val intent = Intent(this, AboutMeActivity::class.java)
        startActivity(intent)
    }

    private fun rollDice() {
        val drawableRes = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.diceImage.setImageResource(drawableRes)
    }
}
