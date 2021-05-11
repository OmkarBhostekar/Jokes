package com.omkarcodes.jokes.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.omkarcodes.jokes.R
import com.omkarcodes.jokes.databinding.ItemJokeBinding
import com.omkarcodes.jokes.models.JokeResponse
import kotlinx.android.synthetic.main.item_joke.view.*

class JokeAdapter(
    private val list: List<JokeResponse>,
    val listener: OnClickListener
) : RecyclerView.Adapter<JokeAdapter.ViewHolder>() {

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_joke,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val joke = list[position]
        holder.itemView.apply {
            tvJoke.text = joke.joke
            setOnClickListener {
                listener.onClick(joke = joke.joke)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnClickListener{
        fun onClick(joke: String)
    }
}