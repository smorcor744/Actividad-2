package org.ventanas.Kotlin.Actividad1

//Ejercicio 10: "Simulación de ataque en equipo"
//Crea un programa que simule un ataque en equipo. Cada miembro del
//equipo tiene un daño diferente y todos atacan a un enemigo con vida
//inicial de 500. El programa debe restar la suma de los ataques de todos
//los miembros al enemigo hasta que su vida sea 0 o menor

fun ejercicio10() {
    var vidaEnemigo = 500
    val danios = listOf(50, 30, 70, 40)

    while (vidaEnemigo > 0) {
        println("Vida del enemigo: $vidaEnemigo")
        vidaEnemigo -= danios.sum()
    }

    println("¡El enemigo ha sido derrotado!")
}