package org.ventanas.Kotlin.Actividad1

//Ejercicio 4: "Monedas en un Tesoro"
//Escribe un programa que simule recoger monedas. El programa debe
//tener un bucle que repita 10 veces, sumando 5 monedas en cada
//iteración, e imprimiendo el número de monedas en cada paso.

fun ejercicio4(){
    var cont = 0
    var monedas = 0
    while (cont != 5){
        monedas += 5
        cont++
        println(monedas)
    }
}