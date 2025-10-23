package Ejercicios2;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero, por favor.");

        int numero = scanner.nextInt();
        System.out.println("El número es: " + numero);


        System.out.println("El doble de ese número es: " + numero * 2);
        System.out.println("El triple de ese número es: " + numero * 3);

        scanner.close();
    }
}
