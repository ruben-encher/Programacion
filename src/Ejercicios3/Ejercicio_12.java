package Ejercicios3;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el precio de un producto:");
        double precio = scanner.nextInt();
        double resultado = 0;
        resultado = precio*1.21;
        System.out.println("El resultado de tu precio con el 21% de IVA es: " + resultado);

        scanner.close();
    }
}
