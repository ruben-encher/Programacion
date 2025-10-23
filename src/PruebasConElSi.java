import java.util.Scanner;

public class PruebasConElSi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            if (edad >= 65) {
                System.out.println("Estás jubilado");
            }
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        if (edad >= 65) {
            System.out.println("Estás jubilado");
        } else if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        scanner.close();
    }
}
