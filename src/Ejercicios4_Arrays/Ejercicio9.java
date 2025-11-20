package Ejercicios4_Arrays;

/*
Crea un programa que mezcle dos arrays ordenados de N elementos, consiguiendo otro array de N*2 elementos igualmente ordenados.
 */

public class Ejercicio9 {

    public static void main(String[] args) {

        int[] A = {4, 8, 15, 22, 25, 40};
        int[] B = {3, 6, 18, 21, 25, 47};

        int nA = A.length;
        int nB = B.length;

        int[] C = new int[nA + nB];

        int i = 0;
        int j = 0;
        int k = 0;


        while (i < nA && j < nB) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }


        while (i < nA) {
            C[k] = A[i];
            i++;
            k++;
        }


        while (j < nB) {
            C[k] = B[j];
            j++;
            k++;
        }


        System.out.print("Array C: ");
        for (int x = 0; x < C.length; x++) {
            System.out.print(C[x] + " ");
        }
    }
}
