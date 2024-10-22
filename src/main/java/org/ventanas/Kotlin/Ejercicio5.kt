package org.ventanas.Kotlin
/*Ejercicio 5: Definición de una clase en Java y Kotlin
Vamos a ver cómo crear una clase simple para un personaje con atributos como nombre,
vida y ataque.
Explica cómo Kotlin simplifica la definición de clases y el constructor frente a Java.
Java:
public class Personaje {
String nombre;
int vida;
int ataque;
public Personaje(String nombre, int vida, int ataque) {
this.nombre = nombre;
this.vida = vida;
this.ataque = ataque;
}
public void mostrarInfo() {
System.out.println("Nombre: " + nombre + ", Vida: " + vida + ", Ataque: " + ataque);
}
public static void main(String[] args) {
Personaje goku = new Personaje("Goku", 100, 50);
goku.mostrarInfo();
}
}
*/
class Personaje(
    val nombre: String,
    val vida:Int,
    val ataque:Int,
){
    fun mostrarInfo(){
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }
}

