package com.ironsoftware.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Veri hazırliği
        var KahramanIsimleri = ArrayList<String>()
        KahramanIsimleri.add("Polat ALEMDAR")
        KahramanIsimleri.add("Süleyman ÇAKIR")
        KahramanIsimleri.add("Duran Emmi")
        KahramanIsimleri.add("Laz Ziya")
        KahramanIsimleri.add("Seyfo Dayı")
        KahramanIsimleri.add("Memati BAŞ")
        KahramanIsimleri.add("Abdülhey")
        KahramanIsimleri.add("Güllü Erhan")
        //Verimsiz Tanımlamalar
        /*
        val polatBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.polat)
        val cakirBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.cakir)
        val emmiBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.duranemmijpg)
        val lazziyaBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.lazziya)
        val seyfodayiBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.seyfodayi)
        val mematiBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.memati)
        val abdülBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.abdulhey)
        val güllüBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.gulluerhan)

        var KahramanGorselleri = ArrayList<Bitmap>()
        KahramanGorselleri.add(polatBitmap)
        KahramanGorselleri.add(cakirBitmap)
        KahramanGorselleri.add(emmiBitmap)
        KahramanGorselleri.add(lazziyaBitmap)
        KahramanGorselleri.add(seyfodayiBitmap)
        KahramanGorselleri.add(mematiBitmap)
        KahramanGorselleri.add(abdülBitmap)
        KahramanGorselleri.add(güllüBitmap)
        */

        //Verimli Tanımlamalar
        val polatDrawbleId = R.drawable.polat
        val cakirDrawbleId = R.drawable.cakir
        val emmiDrawbleId = R.drawable.duranemmijpg
        val lazziyaDrawbleId = R.drawable.lazziya
        val seyfodayiDrawbleId = R.drawable.seyfodayi
        val mematiDrawbleId = R.drawable.memati
        val abdulDrawbleId = R.drawable.abdulhey
        val gulluDrawbleId = R.drawable.gulluerhan

        var KahramanDrawbleListesi = ArrayList<Int>()
        KahramanDrawbleListesi.add(polatDrawbleId)
        KahramanDrawbleListesi.add(cakirDrawbleId)
        KahramanDrawbleListesi.add(emmiDrawbleId)
        KahramanDrawbleListesi.add(lazziyaDrawbleId)
        KahramanDrawbleListesi.add(seyfodayiDrawbleId)
        KahramanDrawbleListesi.add(mematiDrawbleId)
        KahramanDrawbleListesi.add(abdulDrawbleId)
        KahramanDrawbleListesi.add(gulluDrawbleId)
        //Adapter

        val layouManager = LinearLayoutManager(this,)
        recyclerView.layoutManager = layouManager

        val adapter=RecyclerAdapter(KahramanIsimleri, KahramanDrawbleListesi)
        recyclerView.adapter=adapter
    }
}