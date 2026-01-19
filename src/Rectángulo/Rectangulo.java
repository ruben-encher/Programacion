package Rectángulo;

public class Rectangulo {


    private int largo;
    private int ancho;


    private static final int largoNormal = 5;
    private static final int anchoNormal = 3;


    public Rectangulo() {
        this.largo = largoNormal;
        this.ancho = anchoNormal;
    }


    public Rectangulo(int largo, int ancho) {
        if (largo > 0 && ancho > 0) {
            this.largo = largo;
            this.ancho = ancho;
        } else {
            this.largo = largoNormal;
            this.ancho = anchoNormal;
        }
    }


    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }


    public void setLargo(int largo) {
        if (largo > 0) {
            this.largo = largo;
        }
    }

    public void setAncho(int ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        }
    }


    public int calcularArea() {
        return largo * ancho;
    }


    public int calcularPerimetro() {
        return 2 * (largo + ancho);
    }


    public String orientacion() {
        if (largo > ancho) {
            return "Horizontal";
        } else {
            return "Vertical";
        }
    }


    public void mostrarDimensiones() {
        System.out.println("Largo: " + largo);
        System.out.println("Ancho: " + ancho);
    }


    public void dibujarRectangulo() {
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

