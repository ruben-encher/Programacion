public class Movil {
    // Atributos
    private String marca;
    private int bateria;
    private boolean estaBloqueado;

    public Movil(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
    }

    public Movil() {
        this("Generico", 100);
    }

    //Métodos
    static void llamar() {
        System.out.println("Llamando...");
    }
}
