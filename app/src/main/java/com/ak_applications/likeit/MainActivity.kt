package com.ak_applications.likeit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.get
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ak_applications.likeit.`interface`.OnItemClickListener
import com.ak_applications.likeit.adapter.HoriRVAdapter
import com.ak_applications.likeit.adapter.VerrticalRVAdapter
import com.ak_applications.likeit.data.ClickedData
import com.ak_applications.likeit.data.RowData
import com.ak_applications.likeit.data.VarticalRVData
import com.google.android.material.checkbox.MaterialCheckBox
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_card_view.*
import kotlinx.android.synthetic.main.vertical_rv_card_view.*

class MainActivity : AppCompatActivity() {


    private var mainRowRecycler: RecyclerView?=null
    private var mainRecyclerAdapter: VerrticalRVAdapter?=null
    lateinit var TopTxt: TextView
    private var HRecycleView: RecyclerView?=null
    private var HRecyclerAdapter: HoriRVAdapter?=null




    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RowList1: MutableList<RowData> = ArrayList()
        RowList1.add(RowData("A"))
        RowList1.add(RowData("D"))
        RowList1.add(RowData("C"))
        RowList1.add(RowData("B"))

        val RowList2: MutableList<RowData> = ArrayList()
        RowList2.add(RowData("D"))
        RowList2.add(RowData("X"))
        RowList2.add(RowData("A"))
        RowList2.add(RowData("Y"))


        val RowList3: MutableList<RowData> = ArrayList()
        RowList3.add(RowData("C"))
        RowList3.add(RowData("B"))
        RowList3.add(RowData("W"))
        RowList3.add(RowData("Z"))


        val RowList4: MutableList<RowData> = ArrayList()
        RowList4.add(RowData("Z"))
        RowList4.add(RowData("X"))
        RowList4.add(RowData("Y"))
        RowList4.add(RowData("D"))


        var varItem: MutableList<VarticalRVData> = ArrayList()
        varItem.add(VarticalRVData("1", RowList1))
        varItem.add(VarticalRVData("2", RowList2))
        varItem.add(VarticalRVData("3", RowList3))
        varItem.add(VarticalRVData("4", RowList4))

        setMainRowRecycler(varItem)

        TopTxt = LTxt
        TopTxt.text = HRecyclerAdapter?.LCC ?: "no nnnn"





    }



    private fun setMainRowRecycler(varItems: List<VarticalRVData>)
    {
        mainRowRecycler = VerticalRV
        mainRowRecycler!!.layoutManager = LinearLayoutManager(this)
        mainRecyclerAdapter = VerrticalRVAdapter(this, varItems)
        mainRowRecycler!!.adapter = mainRecyclerAdapter
    }







}