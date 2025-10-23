package EjerciciosFunciones;

// Escribe un método para calcular el área de un rectángulo dados base y altura

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base de un rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Introduce la altura de un rectángulo:");
        double altura = scanner.nextDouble();

        scanner.close();

        double area = areaRectangulo(base, altura);
        System.out.println("El area del rectángulo es: " + area);

    }
    static double areaRectangulo(double base, double altura) {
        return base * altura;
    }
}
