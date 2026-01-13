package Ejercicios5String;

public class Ejercicio1 {
    static void main() {

        String cadena = "Hola a Todos";
        String cadenaEnMayusculas = cadena.toUpperCase();
        System.out.println("Cadena original :: " + cadena);
        System.out.println("Cadena en mayúsculas :: " + cadenaEnMayusculas);

        // Compruebo los cambios
        int cambios = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != cadenaEnMayusculas.charAt(i)) {
                cambios++;
            }
            System.out.println("Han habido " + cambios + " cambios en total.");
        }
    }
}
