package EjerciciosRepasoFin;

import java.util.Scanner;

public class Multiplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opcion:");
        int opcion = scanner.nextInt();

        String[][] sesiones = new String[5][4];
        sesiones[1][1] = "Pelicula1";
        sesiones[1][2] = "Pelicula2";
        sesiones[1][3] = "Pelicula3";
        sesiones[1][4] = "Pelicula4";
        sesiones[2][1] = "Pelicula5";
        sesiones[2][2] = "Pelicula6";
        sesiones[2][3] = "Pelicula7";
        sesiones[2][4] = "Pelicula8";

        int [][] sala1 = new int[8][10];
        int [][] sala2 = new int[8][10];
        int [][] sala3 = new int[10][12];
        int [][] sala4 = new int[6][8];
        int [][] sala5 = new int[6][8];

        String[] peliculas = new String[] {"Pelicula1", "Pelicula2", "Pelicula3", "Pelicula4", "Pelicula5", "Pelicula6", "Pelicula7", "Pelicula8"};



    }
}
