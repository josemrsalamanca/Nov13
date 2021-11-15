package com.example.nov13evi4

fun main() {
    // Se muestran 4 ejemplos para pares, pero linea 5 y 8 son los más correctos
    val coordinates: Pair<Int, Int> = Pair(2, 3)
    println(coordinates)
    println()
    val coordinates2: Pair<Int,String> = Pair(2,"Tres")
    println(coordinates2)
    println()

    // Mostrar un par de coordenadas con 3 valores
    val coordinates3D = Triple(2, 3, 1)
    val x3 = coordinates3D.first
    val y3 = coordinates3D.second
    val z3 = coordinates3D.third
    println(coordinates3D)
}