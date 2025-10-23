package Ejercicios2;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número de 3 cifras.");

        int numero = scanner.nextInt();
        System.out.println("Tu número se mostrará por separado: " + (numero/100) + " " + (numero / 10 % 10) + " " + (numero % 10));

        scanner.close();
    }
}
