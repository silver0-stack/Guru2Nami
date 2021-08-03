package com.cookandroid.guru2nami.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cookandroid.guru2nami.R
import com.cookandroid.guru2nami.User.Together

//공구화면 리스트뷰와 카드뷰 연결 어댑터

class ListTogetherAdapter (private val togList : ArrayList<Together>) : RecyclerView.Adapter<ListTogetherAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListTogetherAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_tog_list,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListTogetherAdapter.MyViewHolder, position: Int) {
        val currentitem = togList[position]

        holder.togTitle.text = currentitem.togTitle
        holder.hopeArea2.text = currentitem.hopeArea2
        holder.content3.text = currentitem.content3

    }

    override fun getItemCount(): Int {
        return togList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val togTitle : TextView = itemView.findViewById(R.id.title_tog)
        val hopeArea2 : TextView = itemView.findViewById(R.id.hopeArea2)
        val content3 : TextView = itemView.findViewById(R.id.content_main2)
    }


}