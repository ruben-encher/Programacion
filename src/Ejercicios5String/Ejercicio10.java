package Ejercicios5String;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Palabra a adivinar
        String palabra = "PROGRAMACION".toUpperCase();

        // Array para mostrar los aciertos
        char[] progreso = new char[palabra.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }

        int intentos = 8;
        boolean palabraAdivinada = false;

        System.out.println("=== JUEGO DEL AHORCADO ===");
        System.out.println("Tienes " + intentos + " intentos para adivinar la palabra.");

        while (intentos > 0 && !palabraAdivinada) {

            // Mostrar progreso actual
            System.out.print("Palabra: ");
            for (char c : progreso) {
                System.out.print(c + " ");
            }
            System.out.println();

            // Pedir letra
            System.out.print("Introduce una letra: ");
            char letra = sc.next().toUpperCase().charAt(0);

            boolean acierto = false;

            // Comprobar si la letra está en la palabra
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                System.out.println("❌ La letra no está. Te quedan " + intentos + " intentos.");
            } else {
                System.out.println("✔️ ¡Correcto!");
            }

            // Comprobar si ya no quedan guiones
            palabraAdivinada = true;
            for (char c : progreso) {
                if (c == '_') {
                    palabraAdivinada = false;
                    break;
                }
            }
        }

        // Fin del juego
        if (palabraAdivinada) {
            System.out.println("\n🎉 ¡Felicidades! Has adivinado la palabra: " + palabra);
        } else {
            System.out.println("\n💀 Has perdido. La palabra era: " + palabra);
        }

        sc.close();
    }
}

