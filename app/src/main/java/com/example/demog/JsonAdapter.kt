package com.example.demog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demog.jsonParse.Result

class JsonAdapter(private val results: List<Result>) : RecyclerView.Adapter<JsonAdapter.JsonViewHolder>() {


    class JsonViewHolder ( view:View) : RecyclerView.ViewHolder(view){
        val titleView:TextView = view.findViewById(R.id.titleView)
        val lastView:TextView = view.findViewById(R.id.lastView)
        val firstView:TextView = view.findViewById(R.id.firstView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JsonViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_cardview,parent,false)
            return JsonViewHolder(view)
    }

    override fun onBindViewHolder(holder: JsonViewHolder, position: Int) {
        val result=results[position]
        val name = result.name
        holder.titleView.text=name.title
        holder.lastView.text=name.last
        holder.firstView.text=name.first
    }

    override fun getItemCount() = results.size
}