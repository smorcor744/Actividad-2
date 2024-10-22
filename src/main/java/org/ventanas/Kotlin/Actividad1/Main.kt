package org.ventanas.Kotlin.Actividad1

import kotlin.random.Random

fun main() {
    var finish = false
    while (!finish){
        println("Elige el ejercicio del 1 al 10 o x para salir.:")
        val ejercicio = readln()
        when(ejercicio){
            "1"-> ejercicio1()
            "2"-> ejercicio2()
            "3"-> {
                println("Dame un número:")
                val num = readln().toIntOrNull()
                if (num != null ){
                    ejercicio3(num)
                } else println("Error en la inserción del numero.")
            }
            "4"-> ejercicio4()
            "5"-> ejercicio5()
            "6"-> ejercicio6()
            "7"-> ejercicio7()
            "8"-> ejercicio8()
            "9"-> ejercicio9()
            "10"-> ejercicio10()
            "x"-> finish = true
        }
    }

}

data class Personaje(var vida:Int, var ataque:Int)

fun ejercicio(){
    val personaje1 = Personaje(100,Random.nextInt(0,10))
    val personaje2 = Personaje(100,Random.nextInt(0,10))

    while (personaje2.vida > 0 && personaje1.vida > 0){
        personaje2.vida -= personaje1.ataque
        if (personaje2.vida <= 0) println("Gano el personaje 2")
        personaje1.vida -= personaje2.ataque
        if (personaje1.vida <= 0) println("Gano el personaje 1")
    }

}