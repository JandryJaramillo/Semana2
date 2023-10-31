package com.example.semana2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pressBtn()
        calcEdad()

    }

    fun pressBtn(){
        val btn01= findViewById<Button>(R.id.btn01)
        val tv01= findViewById<TextView>(R.id.tv01)

        btn01.setOnClickListener(){
            tv01.setText("Hola este es un nuevo mensaje")
        }
    }

    fun calcEdad(){
        val btn02= findViewById<Button>(R.id.bt02)
        btn02.setOnClickListener(){
            val saltar:Intent= Intent(this,MainActivity2::class.java)
            startActivity(saltar)
        }

    }
}