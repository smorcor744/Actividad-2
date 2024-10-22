package org.ventanas.Kotlin
//Ejercicio 1: Declarar variables en Java y Kotlin
//En este ejercicio, compararemos cómo se declaran variables en ambos lenguajes y las
//diferencias en cuanto a la inferencia de tipos.
//Java:
//public class Main {
//public static void main(String[] args) {
//int vida = 100;
//String personaje = "Naruto";
//System.out.println("El personaje " + personaje + " tiene " + vida + " puntos de vida.");
//}
//}
fun Ejercicio1() {
    val vida = 100
    val personaje = "Naruto"
    println("El personaje $personaje tiene $vida puntos de vida.")
}