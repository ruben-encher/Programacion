package Ejercicios2_Basicos;

// Programa Java que lea un número entero y calcule si es par o impar.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número:");

        int numero = scanner.nextInt();

        if (numero % 2 != 0) {
            System.out.println("Es impar");
        } else {
            System.out.println("Es par");
        }

        scanner.close();
    }
}
