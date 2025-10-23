package Ejercicios3;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de dinero:");

        int cantidad = scanner.nextInt();
        int billete500 = cantidad / 500;
        cantidad = cantidad % 500;

        int billete200 = cantidad / 200;
        cantidad = cantidad % 200;

        int billete100 = cantidad / 100;
        cantidad = cantidad % 100;

        int billete50 = cantidad / 50;
        cantidad = cantidad % 50;

        int billete20 = cantidad / 20;
        cantidad = cantidad % 20;

        int billete10 = cantidad / 10;
        cantidad = cantidad % 10;

        int billete5 = cantidad / 5;
        cantidad = cantidad % 5;

        System.out.println("Billetes de 500: " + billete500);
        System.out.println("Billetes de 200: " + billete200);
        System.out.println("Billetes de 100: " + billete100);
        System.out.println("Billetes de 50: " + billete50);
        System.out.println("Billetes de 20: " + billete20);
        System.out.println("Billetes de 10: " + billete10);
        System.out.println("Billetes de 5: " + billete5);
        System.out.println("Y el resto es: " + cantidad);

        scanner.close();

    }
}
