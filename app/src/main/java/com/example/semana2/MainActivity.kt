package com.example.semana2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var variable1 = "HOLA MUNDO"
        println(variable1)
        var variable2 = variable1
        variable1 = "SALUDOS"
        println(variable1)

        val cons1 = "Presidente: Daniel Noboa"
        println(cons1)
        val cons2 = cons1
        println(cons2)

        val line1 = "HoLa Android"
        val line2 = "Desarrollo de plataformas móviles"
        val line3 = line1 + " " + line2
        println(line3)

        val int = 1
        val int2 = 2
        val int3 = int + int2
        println(int3)

        val doble = 1.5
        val doble2 = 2.6
        val doble3 = 1
        val doble4 = doble + doble2 + doble3
        println(doble4)

        val bol = true
        val bol2 = false
        println(bol == bol2)
        println(bol && bol2)

        val edad = 24
        if (edad >= 18){
            println("Es mayor de edad")
        }else{
            println("Es menor de edad")
        }

        val pais = "Ecuador"
        when(pais){
            "Ecuador","Colombia","Perú" ->{println("Idioma Español")}
            "EEUU" ->{println("Idioma Ingles")}
            "Francia" ->{println("Idioma Frances")
            }
            else ->{println("Idioma Desconocido")}
        }

        val name= "Jandry"
        val surname= "Jaramillo"
        val university= "UTPL"
        val age= "24"

        val myArray= arrayListOf<String>()
        myArray.add(name)
        myArray.add(surname)
        myArray.add(university)
        myArray.add(age)

        println(myArray)
        myArray.addAll(listOf("Hola","Curso de android"))
        println(myArray)

        myArray.removeAt(4)
        println(myArray)

        myArray.forEach{
            println(it)
        }

        println(myArray.first())
        println(myArray.last())
        myArray.sort()
        println(myArray)
        println(myArray.count())
        myArray.clear()
        println(myArray.count())

        var myMap: Map<String,Int> = mapOf()

        myMap= mutableMapOf("Jandry" to 1, "Josue" to 2, "Sara" to 5, "6" to 6)
        println(myMap)
        myMap["Carlos"]=7
        myMap.put("Abi",8)
        myMap.put("Sam",8)
        println(myMap)
        */
        //TALLER SEMANA 2
        //EJECICIO 1
        val cedula = arrayListOf(1, 1, 0, 5, 6, 3, 8, 0, 4, 1)
        val comprobar = arrayListOf(2, 1, 2, 1, 2, 1, 2, 1, 2)
        var resultado = 0

        for (i in 0 until cedula.size - 1) {
            val multiplicacion = cedula[i] * comprobar[i]
            if (multiplicacion >= 10) {
                resultado += (multiplicacion / 10)
                resultado += (multiplicacion % 10)
            } else {
                resultado += multiplicacion
            }
        }

        val mayorProximo = 30

        if (resultado <= mayorProximo) {
            resultado = (mayorProximo - resultado)
        }

        val ultimoValorCedula = cedula.last()

        println("Resultado: $resultado")

        if (resultado == ultimoValorCedula) {
            println("La cedula es correcta")
        } else {
            println("La cedula es incorrecta")
        }

        //EJERCICIO 2
        val a20 = arrayListOf(2, 5, 7, 15, 96, 41, 5, 8, 10, 14, 27, 35, 62, 45, 24, 14, 42, 15, 63, 1)

        val pares = mutableListOf<Int>()
        val impares = mutableListOf<Int>()

        for (numero in a20) {
            if (numero % 2 == 0) {
                pares.add(numero)
            } else {
                impares.add(numero)
            }
        }

        println("Números pares: $pares")
        println("Números impares: $impares")

        //EJERCICIO 3
        data class Persona(val nombre: String, val cedula: String, val edad: Int, val estadoCivil: String)


            val personas = listOf(
                Persona("Jandry", "1105638041", 24, "soltero"),
                Persona("Josue", "1102767033", 60, "casado"),
                Persona("Joel", "1105637441", 70, "soltero"),
                Persona("Gerald", "1102638041", 61, "soltero"),
                Persona("Jamil", "1104738041", 63, "divorciado")
            )

            val mayoresDeEdadSolteros = personas.filter { it.edad > 60 && it.estadoCivil == "soltero" }

            if (mayoresDeEdadSolteros.isEmpty()) {
                println("No hay personas mayores de 60 años con estado civil 'soltero'.")
            } else {
                println("Personas mayores de 60 años con estado civil 'soltero':")
                for (persona in mayoresDeEdadSolteros) {
                    println("Nombre: ${persona.nombre}, Cédula: ${persona.cedula}, Edad: ${persona.edad}, Estado Civil: ${persona.estadoCivil}")
                }
            }


    }

}