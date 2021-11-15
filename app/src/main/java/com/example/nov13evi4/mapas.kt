package com.example.nov13evi4

// Es una variable que nunca va a cambiar (const)
const val POINTS_X_PASS: Int = 15

//Primer_ Esto <> representa un par valor, el primer int es una key y el segundo int una cuenta ambos tipo numerico
val passAccounts: MutableMap<Int,Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)

//Segundo: Similar a lo del List, es solo para mostrar
val passReport: Map<Int, Int> = passAccounts

// Tercer: actualizar los puntos d una cuenta
fun updatePointsCredit(accountId: Int) {
    // Si el nuevo accountId esta dentro hacer si verdadero, sino else
    if (passAccounts.containsKey(accountId)) {
        println("Updating $accountId...")
        passAccounts[accountId] = passAccounts.getValue(accountId) + POINTS_X_PASS
        println("Nuevo Saldo: ${passAccounts[accountId]}")
    } else {
        println("Error: Trying to update a non-existing account (id:$accountId)")
    }
}

//Cuarto: Recorre  el map y lo muestra
fun accountsReport() {
    println("Reporte")
    passReport.forEach {
            j, m -> println("ID $j (key): credit $m (value)")
    }
}

//Quinto: Si quiero agregar otra key ademas de la 1 2 y 3
fun addNewKey(id: Int){
    if(passAccounts.containsKey(id).not()){
        passAccounts[id] = 100
        println("El id $id fue creado con exito")
    }else{
        println("El id $id ya existe")
    }
}

fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    addNewKey(5)
    updatePointsCredit(5)
    accountsReport()
}

