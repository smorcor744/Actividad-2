package org.ventanas.Kotlin.Actividad1

//Ejercicio 3: "Multiplicando Ataques"
//Escribe una función llamada multiplicarAtaques que tome un número
//entero como argumento y lo multiplique por 5. Usa esa función para
//calcular y mostrar el daño total de 3 ataques.

fun ejercicio3(num:Int){
    for (i in 1..3){
        println("Daño = ${multiplicarAtaques(num)}")
    }
}

fun multiplicarAtaques(num:Int):Int{
    return num *5
}