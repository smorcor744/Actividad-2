package org.ventanas.Kotlin
/*Ejercicio 3: Uso de for y while
Vamos a practicar con bucles, que en ambos lenguajes se usan mucho, sobre todo en
situaciones como recorrer inventarios o colecciones de objetos.
Compara el uso del bucle for en ambos lenguajes, haciendo hincapié en cómo Kotlin
simplifica la sintaxis.
Java:
public class Main {
public static void main(String[] args) {
String[] cofres = {"Espada", "Escudo", "Poción"};
for (String cofre : cofres) {
System.out.println("Has encontrado: " + cofre);
}
}
}*/
fun ejercicio3(){
    val cofres = listOf("Espada","Escudo","Poción")
    cofres.forEach { println("Has encontrado: $it")}
}