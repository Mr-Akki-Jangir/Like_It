package com.ak_applications.likeit.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ak_applications.likeit.R

import com.ak_applications.likeit.data.RowData
import kotlinx.android.synthetic.main.row_card_view.view.*


class HoriRVAdapter(private val context: Context, private val CDNo: List<RowData>) :
    RecyclerView.Adapter<HoriRVAdapter.HoriRVViewHolder>()
{


    

    lateinit var LCC: String

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoriRVViewHolder {
        return HoriRVViewHolder(LayoutInflater.from(context).inflate(R.layout.row_card_view, parent, false))


    }

    override fun onBindViewHolder(holder: HoriRVViewHolder, position: Int) {
        holder.RowTxt.text = CDNo[position].Char



        holder.BtnChkHrt.setOnCheckedChangeListener { buttonView, isChecked ->
            if (holder.BtnChkHrt.isChecked)
            {
                Toast.makeText(context, "$position", Toast.LENGTH_LONG).show()
                LCC = holder.RowTxt.text.toString()


            }


        }





    }



    override fun getItemCount(): Int = CDNo.size

    class HoriRVViewHolder(RowCard: View) : RecyclerView.ViewHolder(RowCard){

        var RowTxt = RowCard.RowTxt
        var BtnChkHrt = RowCard.HrtChk


    }




}