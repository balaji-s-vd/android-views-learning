package com.views.learning

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class WordAdapter(val wordList: Array<String>): RecyclerView.Adapter<WordViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WordViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.word_item, parent, false)

        val textView = view.findViewById<TextView>(R.id.word_text) as TextView

        textView.setOnClickListener {
            Toast.makeText(parent.context, "Clicked ${textView.text}", Toast.LENGTH_SHORT).show()
        }

        return WordViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.bind(wordList[position])
    }

    override fun getItemCount(): Int {
        return wordList.size
    }

}