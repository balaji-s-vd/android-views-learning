package com.views.learning.data

import android.content.Context
import com.views.learning.R

class DataSource(val context: Context) {
    fun getWordList(): Array<String> {
        return context.resources.getStringArray(R.array.word_list)
    }
}