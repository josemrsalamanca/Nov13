package com.example.nov13evi4

// Primero: Aca se crea una variable tipo mutableset
val nuevoString: MutableSet<String> = mutableSetOf("palabra 1","palabra 2","palabra 3")

// Segundo: Aca se añade la palabra
fun añadir(palabra: String):Boolean{
    return nuevoString.add(palabra)
}

//Tercero: Se entrega un string dependiendo si el texto ingresado es o no String
fun verEstado(esAñadido: Boolean):String {
    return if (esAñadido){
        "Fue añadido"
    }else {
        "No fue añadido"
    }
}

fun registrarEimprimir(nuevo: String){
    val pal = añadir(nuevo)
    val estado = verEstado(pal)
    println("Issue $nuevo ${estado}")
}


//Cuarto: Se evalua palabras en el main
//Quinto: Los pasos dentro del main se repiten cada vez que se evalua una palabra, para esto
//se crea una nueva f(x) que permita evitar la redundancia de codigo. Se crea en linea 20.
fun main(){
    registrarEimprimir("palabra 3")
    registrarEimprimir("palabra 5")
    /*
    val nuevo = "palabra 3"
    val pal = añadir(nuevo)
    val estado = verEstado(pal)
    println("Issue $nuevo ${estado}")

    val nuevo2= "palabra 4"
    val pal2= añadir(nuevo2)
    val estado2 = verEstado(pal2)
    println("Issue $nuevo2 ${estado2}")
    */
}
