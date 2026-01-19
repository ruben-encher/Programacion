package Persona;

import java.util.Scanner;

public class mainPersona {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Sexo (H/M): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        //Crear objetos
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona(nombre);

        Persona[] personas = {p1, p2, p3};

        for (int i = 0; i < personas.length; i++) {
            System.out.println("\nPersona " + (i + 1));

            int imc = personas[i].calcularIMC();
            switch (imc) {
                case Persona.pesoBajo:
                    System.out.println("Está por debajo de su peso normal");
                    break;
                case Persona.pesoNormal:
                    System.out.println("Está en su peso normal");
                    break;
                case Persona.sobrepeso:
                    System.out.println("Tiene sobrepeso");
                    break;
            }

            if (personas[i].esMayorDeEdad()) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }

            System.out.println(personas[i].toString());
        }

        sc.close();
    }
}

