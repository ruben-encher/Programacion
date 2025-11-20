package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de filas:");
        int niveles = scanner.nextInt();

        String numeros = (funcionString(niveles));
    }

    static String funcionString(int niveles) {
        int a, b, c;
        a = 1;
        b = 1;

        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    return a + " ";
                } else if (j == 2) {
                    return b + " ";
                } else {
                    c = a + b;
                    return c + " ";
                }
            }
        }
        return "";
    }
}
