package com.views.learning

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val textView = itemView.findViewById<TextView>(R.id.word_text)

    fun bind(word: String) {
        textView.text = word
    }
}