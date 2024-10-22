package org.ventanas;

//Ejercicio 2: Uso de if y operadores ternarios
//Vamos a ver cómo traducir el operador ternario en Java a Kotlin, ya que Kotlin no tiene un
//operador ternario explícito.
//Explica cómo funciona la estructura if en Kotlin en comparación con el operador ternario en
//Java.
//Kotlin:
//fun main() {
//val energia = 80
//val estado = if (energia > 50) "Personaje fuerte" else "Personaje débil"
//println(estado)
//}
public class Ejercicio2 {
    public static void execute(){
        int energia = 80;
        String estado = (energia >50) ? "Personaje fuerte" : "Personaje debil";
    }
}
