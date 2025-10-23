package Ejercicios2_Basicos;

// Realiza un programa que permita la entrada de varios números y calcule su media.

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaNumeros = 0;
        double numero;
        double CantidadNumeros;
        double media;
        System.out.println("Introduce la cantidad de numeros que quieras: ");
        CantidadNumeros = scanner.nextDouble();

        System.out.println("Introduce los números:");
        for(int i= 1; i <= CantidadNumeros; i++) {
            System.out.println("Número " + i + ": ");
            numero = scanner.nextDouble();
            sumaNumeros = sumaNumeros + numero;
        }

        media = sumaNumeros / CantidadNumeros;
        System.out.println("La media es: " + media);

        scanner.close();


    }
}
