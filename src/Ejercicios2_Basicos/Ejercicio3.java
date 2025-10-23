package Ejercicios2_Basicos;

// Desarrolla un programa que, dado un número entre el 1 y el 7, indique el día de la semana del que se trata.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El número " + numero + " Corresponde al lunes");
                break;
            case 2:
                System.out.println("El número " + numero + " Corresponde al martes");
                break;
            case 3:
                System.out.println("El número " + numero + " Corresponde al miércoles");
                break;
            case 4:
                System.out.println("El número " + numero + " Corresponde al jueves");
                break;
            case 5:
                System.out.println("El número " + numero + " Corresponde al viernes");
                break;
            case 6:
                System.out.println("El número " + numero + " Corresponde al sábado");
                break;
            case 7:
                System.out.println("El número " + numero + " Corresponde al domingo");
                break;
        }
    }
}
