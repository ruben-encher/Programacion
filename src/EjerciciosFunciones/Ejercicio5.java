package EjerciciosFunciones;

// Implementa un método que calcule el mayor entre tres números.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Introduce el tercer número:");
        int num3 = scanner.nextInt();

        scanner.close();

        int calculo = numeroMayor(num1, num2, num3);
        System.out.println("El número mayor es: " + calculo);

    }

    static int numeroMayor(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a) {
            return b;
        } else {
            return c;
        }
    }
}