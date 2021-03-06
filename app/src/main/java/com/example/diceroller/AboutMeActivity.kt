package com.example.diceroller

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.View
import com.example.diceroller.databinding.ActivityAboutMeBinding
import kotlinx.android.synthetic.main.activity_about_me.*

class AboutMeActivity : BaseActivity() {

    private lateinit var binding: ActivityAboutMeBinding
    private lateinit var aboutMeData: AboutMeData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about_me)

        initData()
        initListeners()
    }

    override fun initData() {
        aboutMeData = AboutMeData(this)
        binding.aboutMeData = aboutMeData
    }

    override fun initListeners() {
        done_button.setOnClickListener { onClick(it) }
    }

    override fun onClick(view: View) {
        when (view.id) {
            binding.doneButton.id -> addNickname()
        }
    }

    private fun addNickname() {
        binding.apply {
            aboutMeData?.nickname = nicknameEdit.text.toString()
            invalidateAll()
            ViewUtils.changeVisibility(nicknameEdit, View.GONE)
            ViewUtils.changeVisibility(nicknameText, View.VISIBLE)
            ViewUtils.changeVisibility(doneButton, View.GONE)
        }

        KeyboardUtils.hideSoftKeyboard(this, binding.nicknameEdit)
    }
}
