package Ejercicios2;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿A cuantos kilómetros hora iba?");

        int km = scanner.nextInt();
        System.out.println("Usted iba a ésta cantidad de m/s: " + km / 3.6);
        double ms = scanner.nextInt();

        scanner.close();

    }
}
