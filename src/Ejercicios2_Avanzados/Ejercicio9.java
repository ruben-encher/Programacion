package Ejercicios2_Avanzados;

// Mostrar los N primeros términos de la serie de Fibonacci. N se definirá como una variable.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\"Ingrese el número de términos (N): \"");
        int N = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Los primeros " + N + " términos de la serie de Fibonacci son:");

        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        scanner.close();
    }
}

