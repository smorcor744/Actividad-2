package org.ventanas.Kotlin.Actividad1

//Ejercicio 8: "Inventario de Objetos"
//Crea un programa que simule un inventario de un personaje usando una
//lista. El personaje puede añadir un objeto al inventario, eliminarlo o
//mostrar los objetos actuales.

fun ejercicio8(){
    val inventario = mutableListOf<String>()
    var verificar = false
    while (!verificar) {

        println("Que desea hacer: \n 1.Añadir Objetos\n 2.Eliminar Objetos \n 3.Salir")

        val input = readln()
        when (input) {
            "1" -> add(inventario)
            "2" -> eliminar(inventario)
            "3" -> verificar = true
            else -> println("Opción no valida")
        }
    }

}
fun add(inventario: MutableList<String>){
    print("Que objeto desea añadir: ")
    val objeto = readln()
    inventario.add(objeto)
    println("Objeto añadido")

}
fun eliminar(inventario: MutableList<String>){
    print("Que objeto desea eliminar: ")
    val objeto = readln()
    if (inventario.contains(objeto)) {
        inventario.remove(objeto)
        println("Objeto eliminado")
    }else println("Objeto no encontrado")
}