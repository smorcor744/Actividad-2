package org.ventanas.Kotlin
//Ejercicio 7: Funciones simples y expresiones lambda
//Vamos a explorar cómo Kotlin permite simplificar la sintaxis de las funciones y cómo se usan
//las expresiones lambda.
//Compara la simplicidad de las funciones y lambdas en Kotlin con Java, destacando cómo
//Kotlin es más conciso.
//Java:
//public class Main {
//public static void main(String[] args) {
//System.out.println(multiplicar(5));
//// Lambda en Java (requiere interfaz funcional)
//Operacion operacion = (a, b) -> a + b;
//System.out.println(operacion.sumar(3, 4));
//}
//public static int multiplicar(int num) {
//return num * 2;
//}
//interface Operacion {
//int sumar(int a, int b);
//}
//}
fun eje7(){

    val operacion = { a: Int, b: Int -> a + b }
    println(operacion(3, 4))
    val multiplicar: (Int) -> Int = { it * 2 }
    println(multiplicar(2))

}