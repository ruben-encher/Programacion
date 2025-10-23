package Ejercicios2_Basicos;

// Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo. Se debe comprobar que el divisor no puede ser cero.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }

        scanner.close();

    }
}
