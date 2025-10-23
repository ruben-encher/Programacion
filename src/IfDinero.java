import java.util.Scanner;

public class IfDinero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cantidad de dinero de 1 a 10:");

        double dinero = scanner.nextDouble();
        if (dinero > 7) {
            System.out.println("Compras cocacola y bocadillo");
        } else if (dinero > 5) {
            System.out.println("Compras agua y un bocadillo");
        } else if (dinero > 2) {
            System.out.println("Compras cocacola");
        } else {
            System.out.println("Compras agua");
        }

        scanner.close();


    }
}
