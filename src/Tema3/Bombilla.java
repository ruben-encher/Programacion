package Tema3;

public class Bombilla {
    boolean encendida;

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public String devolver() {
        return this.encendida ? "Encendida" : "Apagada";
    }
}
