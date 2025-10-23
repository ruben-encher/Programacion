package EjerciciosFunciones;

// Implementa un método que reciba un nombre y edad y muestre un mensaje personalizado.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("¿Qué edad tienes?");
        int edad = scanner.nextInt();

        scanner.close();

        mensajeAlUsuario(nombre, edad);

        }

    static void mensajeAlUsuario(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}

