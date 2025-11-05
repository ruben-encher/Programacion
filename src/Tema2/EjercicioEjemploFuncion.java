package Tema2;

import java.util.Scanner;

public class EjercicioEjemploFuncion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();
        System.out.println("¿Has tenido accidentes?");
        boolean accidentes = scanner.nextBoolean();
        System.out.println("Introduce tu antiguedad:");
        int antiguedad = scanner.nextInt();
        System.out.println("Introduce la edad de tu coche:");
        int edadCoche = scanner.nextInt();
        System.out.println("Introduce el color de tu coche:");
        String colorCoche = scanner.nextLine();

        int seguro = precioSeguro(edad, accidentes, antiguedad, edadCoche);
        System.out.println(seguro);

    }

    static int precioSeguro(int edad, boolean accidentes, int antiguedad, int edadCoche) {
        double precioBase = 100;
        String[] tipo = new String[]{"A terceros", "todo riesgo"};
        String[] color = new String[]{"rojo", "Azul", "Granate", "Negro", "Verde", "Blanco", "Amarilla", "Morado", "Naranja", "Gris"};
        if (edad <= 17 || edad >= 130) {
            System.out.println("Edad no valida.");
        } else if (edad > 18 && !accidentes) {
            precioBase = precioBase * 20 / 100;
            System.out.println(precioBase);
        } else {
            precioBase = precioBase * 40 / 100;

        }
        if (edad > 30 && !accidentes) {
            precioBase = precioBase * 10 / 100;
        } else {
            precioBase = precioBase * 30 / 100;
        }
        if (edad >= 65 && !accidentes) {
            precioBase = precioBase * 50 / 100;
        } else {
            precioBase = precioBase * 60 / 100;
        }
        if (edadCoche < 6) {
            precioBase -= precioBase * 10 / 100;
        } else {
            precioBase = precioBase * 5 / 100;
        }

        return edad;
    }
}
