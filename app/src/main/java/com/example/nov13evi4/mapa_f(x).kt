package com.example.nov13evi4

// El MAP sirve mucho para MVP, porque tenemos Objetos de dominio, objetos de datos y objetos de presentacion, entonces
// para poder transformar un objeto de una capa a otra se utiliza mucho MAP

fun main(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }

    //Convertir de tipo int a string
    val numberString= numbers.map { x->x.toString() }

    println(numbers)
    println(doubled)
    println(tripled)
    println(numberString)
}