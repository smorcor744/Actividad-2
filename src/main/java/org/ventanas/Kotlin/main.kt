package org.ventanas.Kotlin


fun main() {
    var finish = false
    while (!finish){
        println("Elige el ejercicio del 1,3,5,7 o 8 o x para salir.:")
        val ejercicio = readln()
        when(ejercicio){
            "1"-> eje1()
            "3"-> eje3()
            "5"-> Personaje("Goku", 100, 20).mostrarInfo()
            "7"-> eje7()
            "8"-> ejeFinal()
            "x"-> finish = true
            else -> {
                println("Ejercicio no encontrado")}
        }
    }

}


