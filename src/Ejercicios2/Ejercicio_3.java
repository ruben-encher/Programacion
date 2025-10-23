package Ejercicios2;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");

        String nombre = scanner.nextLine();
        System.out.println("Tu nombre es: " + nombre);

        scanner.close();
    }
}
