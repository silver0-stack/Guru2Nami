package com.cookandroid.guru2nami.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cookandroid.guru2nami.R
import com.cookandroid.guru2nami.User.BuyHistory
import com.cookandroid.guru2nami.User.SalesHistory

//판매내역 화면 리스트뷰, 카드뷰 연결 어댑터
class SalesListAdapter(private val salesList : ArrayList<SalesHistory>) : RecyclerView.Adapter<SalesListAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SalesListAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_buy_history,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SalesListAdapter.MyViewHolder, position: Int) {
        val currentitem = salesList[position]

        //holder.togTitle.text = currentitem.togTitle
        //holder.hopeArea2.text = currentitem.hopeArea2
        //holder.content3.text = currentitem.content3

    }

    override fun getItemCount(): Int {
        return  salesList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        //val togTitle : TextView = itemView.findViewById(R.id.title_tog)
        //val hopeArea2 : TextView = itemView.findViewById(R.id.hopeArea2)
        //val content3 : TextView = itemView.findViewById(R.id.content_main2)
    }
}