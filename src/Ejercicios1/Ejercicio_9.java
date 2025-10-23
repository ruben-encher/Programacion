package Ejercicios1;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int A = 2;
        int B = 3;
        int C = 4;
        int D = 5;

        //B toma el valor de C
        B = C;
        System.out.println("B toma el valor de C = " + B);

        //C toma el valor de A
        C = A;
        System.out.println("C toma el valor de A = " + C);

        //A toma el valor de D
        A = D;
        System.out.println("A toma el valor de D = " + A);

        //D toma el valor de B
        D = B;
        System.out.println("D toma el valor de B = " + D);
    }
}
