package com.example.nov13evi4

fun main(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }

    println(numbers)
    println(positives)
    println(negatives)
}