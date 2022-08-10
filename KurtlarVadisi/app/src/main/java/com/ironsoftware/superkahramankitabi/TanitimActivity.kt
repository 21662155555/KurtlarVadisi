package com.ironsoftware.superkahramankitabi

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)


        val intent = intent
        val secilenKahramanIsmi = intent.getStringExtra("KahramanIsmi")
        textView.text = secilenKahramanIsmi
        val secilenKahramanGorseli = intent.getIntExtra("KahramanGorseli", 0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources, secilenKahramanGorseli)
            imageView.setImageBitmap(bitmap)

        /*
Verimsiz yöntemden kalma
        val secilenKahraman = SingletonClass.SecilenKahraman
        val secilenGorsel = secilenKahraman.görsel
        imageView.setImageBitmap(secilenGorsel)
    }*/
    }
}