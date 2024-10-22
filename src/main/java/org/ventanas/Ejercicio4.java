package org.ventanas;
/*Ejercicio 4: Control de flujo con break y continue
Aquí veremos cómo usar break y continue en Kotlin y compararlo con su equivalente en
Java.
Explica la diferencia en cómo Kotlin maneja rangos y control de flujo frente a Java.
Kotlin:
fun main() {
for (i in 1..5) {
if (i == 3) {
continue // Salta la iteración cuando i es 3
}
println("Número: $i")
}
}
*/
public class Ejercicio4 {
    public static void execute(){
        for (var i = 1; i <= 5; i++){
            if (i == 3){
                continue;
            }
            System.out.println("Número: "+ i);
        }
    }
}
