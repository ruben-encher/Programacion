package Ejercicios2_Basicos;

// Calcular el mayor de tres números enteros en Java.

public class Ejercicio2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 20;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c && b > a) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        }


    }
}
