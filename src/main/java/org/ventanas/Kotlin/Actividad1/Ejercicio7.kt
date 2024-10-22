package org.ventanas.Kotlin.Actividad1

import kotlin.random.Random

//Ejercicio 7: "Combate de dos personajes"
//Crea un programa que simule el combate entre dos personajes. Cada
//uno tiene una cantidad de vida y ataque. En cada ronda, el personaje A
//ataca a B y viceversa, restando vida. El combate termina cuando uno de
//los personajes tiene 0 o menos de vida.
 fun ejercicio7(){
    val ataqueA = Random.nextInt(0,10)
    val ataqueB = Random.nextInt(0,10)

    val personajeA = Personaje(100, ataqueA)
    val personajeB = Personaje(100,ataqueB)

    while (personajeB.vida > 0 && personajeA.vida > 0){

        personajeB.vida -= personajeA.ataque
        if (personajeB.vida <= 0) println("Gano el personaje 2")
        personajeA.vida -= personajeB.ataque
        if (personajeA.vida <= 0) println("Gano el personaje 1")
    }
 }
