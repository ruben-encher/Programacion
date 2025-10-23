package Ejercicios2_Basicos;

// Desarrolla un programa que lea números hasta que se den cinco ceros y escriba después la suma de los números leídos.

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int i = 0;
        double suma = 0;

        while (i < 5) {
            System.out.println("Introduce un número (si son 5 ceros se para)");
            numero = scanner.nextInt();

            if (numero == 0) {
                i++;
            } else {
                suma += numero;
            }
        }

        System.out.println("La suma es: " + suma);
        scanner.close();
    }
}
