package Ejercicios2;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu dirección?");

        String direccion = scanner.nextLine();
        System.out.println("¿Cuál es tu número de teléfono?");
        int numerotf = scanner.nextInt();
        System.out.println("Tu dirección es: " + direccion);
        System.out.println("Tu número de teléfono es: " + numerotf);

        scanner.close();
    }
}
