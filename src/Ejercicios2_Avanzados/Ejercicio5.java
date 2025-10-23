package Ejercicios2_Avanzados;

// Desarrolla un programa que solicite un número n y luego muestre por pantalla la siguiente figura:
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//………….
//1 2 3 4 5 …..n

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número al usuario
        System.out.print("Introduce un número entero n: ");
        int n = scanner.nextInt();

        // Generar la figura
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // salto de línea después de cada fila
        }
    }
}
