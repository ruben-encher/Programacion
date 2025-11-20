package Ejercicios4_Arrays;

/*
Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro mágico aquel en el que las filas,
las columnas y las diagonales suman igual.
 */

public class Ejercicio8 {
    public static void main(String[] args) {

        int[][] m = {
                { 1, 5, 8, 24, 17 },
                {16,14, 7,  5, 23 },
                {20,21,13,  6,  4 },
                { 3,19,12,  9, 10 },
                { 9, 2,25, 18, 11 }
        };

        int n = 5;

        int objetivo = 0;
        for (int j = 0; j < n; j++) {
            objetivo += m[0][j];
        }

        boolean esMagico = true;

        for (int i = 1; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += m[i][j];
            }
            if (sumaFila != objetivo) {
                esMagico = false;
                break;
            }
        }

        for (int j = 0; j < n && esMagico; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) {
                sumaCol += m[i][j];
            }
            if (sumaCol != objetivo) {
                esMagico = false;
                break;
            }
        }

        int sumaDiag1 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag1 += m[i][i];
        }
        if (sumaDiag1 != objetivo) {
            esMagico = false;
        }

        int sumaDiag2 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag2 += m[i][n - 1 - i];
        }
        if (sumaDiag2 != objetivo) {
            esMagico = false;
        }
        if (esMagico) {
            System.out.println("El array es un cuadro mágico.");
        } else {
            System.out.println("El array no es un cuadro mágico.");
        }
    }
}
