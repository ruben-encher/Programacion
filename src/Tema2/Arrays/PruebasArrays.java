package Tema2.Arrays;

import java.util.Arrays;

public class PruebasArrays {
    public static void main(String[] args) {

        int[] notasRuben = new int [3];
        notasRuben[0] = 10;
        notasRuben[1] = 9;
        notasRuben[2] = 9;
        System.out.println(Arrays.toString(notasRuben));
        int[] notasRubenAuxiliares = notasRuben;
        notasRuben = new int[4];
        // Copiamos los valores
        for (int i = 0; i < notasRubenAuxiliares.length; i++) {
            notasRuben[i] = notasRubenAuxiliares[i];
        }
        notasRuben[3] = 9;
        System.out.println(("notasRuben :: " + Arrays.toString(notasRuben)));
        System.out.println(("notasRubenAuxiliares :: " + Arrays.toString(notasRubenAuxiliares)));

        // Ya tenemos en notasRuben los 4 valores
    }
}
