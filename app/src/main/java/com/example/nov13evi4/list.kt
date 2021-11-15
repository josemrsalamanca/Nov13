package com.example.nov13evi4

fun main(){
    // Quinto, se agrega el nuevo elemento
    agregar(4)
    println("Se agrego el: ${ conseguir().size}")

    // para recorrer la lista
    conseguir().forEach(){
        i -> println("Los elementos de la lista son: $i")
    }
}


// Primero se hace una lista mutable
val lista: MutableList<Int> = mutableListOf(1,2,3)
// Segundo lista de solo lectura
val verlista: List<Int> = lista


// Tercero el metodo para agregar un nuevo elemento
fun agregar(newNum: Int){
    lista.add(newNum)
}

// Cuarto, para poder iterar en el main
fun conseguir(): List<Int>{
    return verlista
}



