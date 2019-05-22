package com.example.diceroller

import android.content.Context

data class AboutMeData(var context: Context) {
    var name: String = context.getString(R.string.name)
    var nickname: String = ""
}