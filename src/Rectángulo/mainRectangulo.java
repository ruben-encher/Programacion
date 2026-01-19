package Rectángulo;

public class mainRectangulo {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(12, 3);
        r.mostrarDimensiones();
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
        System.out.println("Orientación: " + r.orientacion());
        r.dibujarRectangulo();
    }
}

