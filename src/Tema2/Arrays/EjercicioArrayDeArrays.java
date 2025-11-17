package Tema2.Arrays;


import java.util.Arrays;

public class EjercicioArrayDeArrays {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3};
        int[] numeros2 = {4, 5, 6};

        int[][] numerosAll = {numeros, numeros2};
        System.out.println("Vamos a imprimir todos los numeros");
        for (int[] numero : numerosAll) {
            System.out.println(Arrays.toString(numero));
        }
    }
}
