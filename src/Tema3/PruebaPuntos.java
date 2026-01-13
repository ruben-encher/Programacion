package Tema3;

public class PruebaPuntos {
    public static void main(String[] args) {

        Punto PuntoA = new Punto(100, 200);
        Punto PuntoB = new Punto(400, 800);
        double distancia = PuntoA.distancia(PuntoB);
        System.out.println("La distancia seria: " + distancia);
    }
}
