package org.ventanas.Kotlin.Actividad1

//Ejercicio 5: "Determinando el Nivel del Personaje"
//Crea un programa que pida el nivel de un personaje. Si el nivel es menor
//a 10, debe imprimir "Personaje principiante". Si es entre 10 y 20,
//"Personaje intermedio". Si es mayor a 20, "Personaje avanzado".

fun ejercicio5(){
    var good = false
    var nivel = 0
    while (!good) {
        print("Nivel de Personaje: ")
        try {
            nivel = readln().toInt()
            good = true

        } catch (e: Exception) {
            println("**Error, parametro inadecuado** ")
        }
    }
    when{
        nivel < 10 -> println("Personaje principiante")
        nivel in 10..20 -> println("Personaje intermedio")
        nivel > 20 -> println("Personaje avanzado")

    }


}