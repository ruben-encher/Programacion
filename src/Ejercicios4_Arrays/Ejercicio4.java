package Ejercicios4_Arrays;

/*
Desarrolla un programa que ordene los índices de un array de enteros, en función del contenido de cada elemento del array,
de mayor a menor, es decir, hay que almacenar en otro array el índice del array original,
en función del contenido del último.
 */

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Array original
        int[] numeros = {34, 54, 12, 85, 45};

        // Array para guardar los índices
        int[] indices = new int[5];

        // Rellenamos el array de índices: 0,1,2,3,4...
        for (int i = 0; i < 5; i++) {
            indices[i] = i;
        }

        // Ordenamos los índices según el contenido del array original (de mayor a menor)
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {

                // Comparamos los valores del array original usando los índices
                if (numeros[indices[j]] < numeros[indices[j + 1]]) {

                    // Intercambiamos los índices
                    int temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
        }

        // Mostramos el resultado
        System.out.println(Arrays.toString(indices));
        System.out.println(Arrays.toString(numeros));
        }
    }
