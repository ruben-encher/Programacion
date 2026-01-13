package Biblioteca;

public class Libro {
    private String titulo;
    private Autor escritor;
    private boolean prestado;

    public Libro(Autor escritor, String titulo) {
        this.prestado = false;
        this.escritor = escritor;
        this.titulo = titulo;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Has alquilado: " + titulo);
        } else {
            System.out.println("Error: " + titulo + "no está disponible");
        }
    }
    public void devolver() {
        prestado = false;
        System.out.println("Has devuelto el libro correctamente, el libro es: " + titulo);
    }
    public void informacion() {
        System.out.println("El libro es: " + titulo + " y es de: " + escritor.mostrarAutor());
    }
}
