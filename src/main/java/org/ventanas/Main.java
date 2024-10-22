package org.ventanas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;

        while (!finish) {
            System.out.println("Elige el ejercicio del 2, 4, 6 o x para salir.:");
            String ejercicio = scanner.nextLine();

            switch (ejercicio) {
                case "2":
                    Ejercicio2.execute();
                    break;
                case "4":
                    Ejercicio4.execute();
                    break;
                case "6":
                    Ejercicio6.execute();
                    break;
                case "x":
                    finish = true;
                    break;
                default:
                    System.out.println("Ejercicio no encontrado");
            }
        }
    }}
