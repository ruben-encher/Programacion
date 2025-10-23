package Ejercicios2;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número.");
        int numero1 = scanner.nextInt();
        System.out.println("Escribe un segundo número.");
        int numero2 = scanner.nextInt();

        System.out.println("Este es tu primer número: " + numero1);
        System.out.println("Este es tu segundo número: " + numero2);

        scanner.close();
    }


}
