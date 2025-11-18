package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura:");
        int altura = scanner.nextInt();


        for (int i = 0; i <= altura; i++) {
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int tronco = altura / 5;

        for (int t = 0; t < tronco; t++) {
            for (int h = 0; h < altura - 1; h++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        scanner.close();
    }
}

