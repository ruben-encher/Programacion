package Ejercicios2_Basicos;

// Escribir un programa en Java que multiplique los 20 primeros números naturales (1*2*3*4*5…).

public class Ejercicio18 {
    public static void main(String[] args) {
        long numero = 1; // Usamos long porque el resultado es grande

        for (int i = 1; i <= 20; i++) {
            numero = numero * i;
        }

        System.out.println("El producto de los 20 primeros números naturales es: " + numero);
    }
}
