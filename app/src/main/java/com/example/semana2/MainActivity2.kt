package com.example.semana2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        regresarHome()
        calcularEdad()
    }

    fun regresarHome(){
        val btn03= findViewById<Button>(R.id.btn03)
        btn03.setOnClickListener(){
            var regresar:Intent=Intent(this,MainActivity::class.java)
            startActivity(regresar)
        }
    }

    fun calcularEdad(){
        val name="Jandry"
        val edad=24
        var mensajeEdad=""
        if(edad>17){
            mensajeEdad = name + " es MAYOR de edad con " +edad +" años de edad"

        }else{
            mensajeEdad = name + " es MENOR de edad con " +edad +" años de edad"
        }
        val tv_find=findViewById<TextView>(R.id.tv02)
        tv_find.setText(mensajeEdad)
    }
}