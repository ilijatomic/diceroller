package com.example.diceroller

import android.support.v7.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    abstract fun initData()
    abstract fun initListeners()

}