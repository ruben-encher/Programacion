package Tema2;

import java.util.Scanner;

public class EjercicioEjemploExamen {
    public static void main(String[] args) {

        int precioInicial = 500;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();
        System.out.println("¿Has tenido accidentes? true/false");
        boolean accidentes = scanner.nextBoolean();

        double precioSeguro = calcularSeguro(precioInicial, edad, accidentes);
    }

    static double calcularSeguro(float precioInicial, int edad, boolean accidentes) {

        if (edad >= 18 && edad < 25) {
            return precioInicial + (precioInicial * 20/100);
        } else if (edad > 35 && edad < 55 && !accidentes) {
            return precioInicial - (precioInicial * 10/100);
        } else if (edad > 65 && !accidentes) {
            return precioInicial + (precioInicial * 10/100);
        } else if (edad > 65 && accidentes) {
            return precioInicial + (precioInicial * 30/100);
        } else {
            return precioInicial;
        }
    }
}
