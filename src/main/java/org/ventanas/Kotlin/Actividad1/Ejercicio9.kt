package org.ventanas.Kotlin.Actividad1

import kotlin.random.Random

//Ejercicio 9: "Sistema de Experiencia"
//Escribe un programa que simule el sistema de experiencia de un
//personaje. Cada vez que gane una batalla, aumenta su experiencia en
//50 puntos. Al llegar a 200 puntos o más, sube de nivel.

fun ejercicio9(){
    var nivel = 0
    val prota = Personaje(100,10)
    while (nivel <200){
        val enemigo = Personaje(Random.nextInt(1,50),Random.nextInt(1,10))
        while (enemigo.vida > 0 && prota.vida > 0){

            enemigo.vida -= prota.ataque

            if (enemigo.vida <= 0){
                nivel += 50
                prota.vida += 50
                prota.ataque += 5
                println("As derrotado a un enemigo.")
                println("As subido de nivel: $nivel")
            }
            prota.vida -= enemigo.ataque

        }
    }
}