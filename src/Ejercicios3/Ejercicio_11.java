package Ejercicios3;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ponme cuanto es el radio de una circunferencia:");

        double numero = scanner.nextInt();
        double resultado = 0;
        resultado = 2*Math.PI*numero;
        System.out.println("La circunferencia mide: " + resultado);
        resultado = Math.PI*numero*numero;
        System.out.println("El área es: " + resultado);

        scanner.close();
    }
}
