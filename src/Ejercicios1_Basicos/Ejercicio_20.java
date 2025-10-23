package Ejercicios1_Basicos;

import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numero = scanner.nextInt();

        int suma = 0;
        for (int i = numero; i < numero + 100; i++) {
            suma += i;
            System.out.println("Sumamos + 1 = " + i);

        }

        System.out.println("El total es: " + suma);

        scanner.close();
    }
}
