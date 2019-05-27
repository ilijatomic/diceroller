package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.view.View

abstract class BaseActivity : AppCompatActivity() {

    abstract fun initData()
    abstract fun initListeners()
    abstract fun onClick(view: View)
}