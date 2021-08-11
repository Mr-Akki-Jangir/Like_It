package com.ak_applications.likeit.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ak_applications.likeit.R
import com.ak_applications.likeit.data.RowData
import com.ak_applications.likeit.data.VarticalRVData
import kotlinx.android.synthetic.main.vertical_rv_card_view.view.*

class VerrticalRVAdapter(private val contex: Context, private val VarItems: List<VarticalRVData>) :
    RecyclerView.Adapter<VerrticalRVAdapter.VerticalRVViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalRVViewHolder {
        return VerticalRVViewHolder(LayoutInflater.from(contex).inflate(R.layout.vertical_rv_card_view, parent, false))
    }

    override fun onBindViewHolder(holder: VerticalRVViewHolder, position: Int) {
        holder.RowName.text = VarItems[position].name
        setRRecycler(holder.HRV, VarItems[position].row_data)

    }

    private fun setRRecycler(recyclerView: RecyclerView, row_data: List<RowData>)
    {

        val RowItemRecyclerAdapter = HoriRVAdapter(contex, row_data)
        recyclerView.layoutManager = LinearLayoutManager(contex, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = RowItemRecyclerAdapter


    }

    override fun getItemCount(): Int = VarItems.size

    class VerticalRVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

       var RowName = itemView.VRVtxt
        var HRV = itemView.HRV

    }

}