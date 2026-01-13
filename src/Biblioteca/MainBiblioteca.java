package Biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        Autor autor = new Autor("Miguel de Cervantes", "España");
        Libro libro = new Libro(autor, "Don Quijote");

        //Comprobamos que el libro no se puede alquilar dos veces.
        libro.prestar();
        libro.prestar();

        //Pedir la información del libro.
        libro.informacion();

        //Comprobamos que podemos devolver el libro y que NO nos da error al volver alquilarlo.
        libro.devolver();
        libro.prestar();
    }
}
