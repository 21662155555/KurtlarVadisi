package com.ironsoftware.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.recycler_row.view.*
import java.util.ArrayList
                                                                                                  //Verimsiz yöntemde bitmap yazmıştık
class RecyclerAdapter (val kahramanListesi : ArrayList<String>, val kahramanGorselleri : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.KahramanVH>() {
    class KahramanVH(itemView : View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): KahramanVH {
              //Inflater , LayoutInflater , MenuInflater
              val itemView = LayoutInflater.from(p0.context).inflate(R.layout.recycler_row,p0,false)
              return KahramanVH(itemView)
    }

    override fun onBindViewHolder(p0: KahramanVH, p1: Int) {
            p0.itemView.recyclerViewtextView.text = kahramanListesi.get(p1)
            p0.itemView.setOnClickListener {
             val intent = Intent(p0.itemView.context,TanitimActivity::class.java)
                intent.putExtra("KahramanIsmi",kahramanListesi.get(p1))
                intent.putExtra("KahramanGorseli",kahramanGorselleri.get(p1))
              /*  val singleton = SingletonClass.SecilenKahraman
                singleton.görsel = kahramanGorselleri.get(p1)
                */
                p0.itemView.context.startActivity(intent)
            }
    }

    override fun getItemCount(): Int {
return kahramanListesi.size
    }

}