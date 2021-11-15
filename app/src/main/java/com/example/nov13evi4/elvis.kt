package com.example.nov13evi4

// para ver el uso de elvis es necesario tener un null, se creara una clase Persona en java y se tomara
// en kotlin para hacer el nullpointexpetion


fun main(){
    // se llama por inferencia, llamando directamente al constructor de java
    val persona = Persona("Jose")
    val persona2 = Persona(null)


    //val nombre :String= persona.nombre
    //val nombre2 :String= persona2.nombre

    // con elvis las 2 lineas anteriores si funcionan
    val nombre :String?= persona.nombre
    // :? "" al final de la linea 19 es el elvis ejecutandose
    val nombre2 :String= persona2.nombre ?: ""


    println(nombre)
    println(nombre2)
}