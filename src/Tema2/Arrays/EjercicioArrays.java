package Tema2.Arrays;

import java.util.Arrays;
import java.util.Random;

public class EjercicioArrays {
    public static void main(String[] args) {

       int[] numeroRandom = new int[20];
        for (int i = 0; i < numeroRandom.length; i++) {
            Random r = new Random();
            numeroRandom[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(numeroRandom));
    }
}
