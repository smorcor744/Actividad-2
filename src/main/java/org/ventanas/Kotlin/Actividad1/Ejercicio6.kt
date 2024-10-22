package org.ventanas.Kotlin.Actividad1

import kotlin.random.Random

//Ejercicio 6: "Batalla de Daño Crítico"
//Escribe una función que simule una batalla. El daño crítico se hace
//cuando el ataque es mayor a 50. Si el ataque es mayor a 50, imprime
//"¡Golpe crítico!" y devuelve el daño multiplicado por 2, de lo contrario
//solo devuelve el daño normal

fun ejercicio6(){
    var cont = 500
    var ataque = 0
    while (cont>= 0){
        ataque = Random.nextInt(0,100)
        if (ataque > 50){
            ataque *= 2
            println("¡Golpe crítico!")
        }
        cont -= ataque
        println(ataque)

    }

}