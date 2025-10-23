package Ejercicios2_Basicos;

// Pedir un número entre 0 y 9.999, decir si es capicúa.

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero y te diré si es capicua o no:");

        int numero = scanner.nextInt();
        if (numero < 10) {
            System.out.println("Es capicua");
        } else if (numero < 100) {
            if (numero / 10 % 10 == numero % 10) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        } else if ( numero < 1000) {
            if (numero / 100 == numero % 10) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        } else if (numero < 10000) {
            if (numero / 1000 == numero % 10 && numero / 100 % 10 == numero / 10 % 10) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        }
    }
}
