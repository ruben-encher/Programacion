package Persona;

public class Persona {


    public static final int pesoBajo = -1;
    public static final int pesoNormal = 0;
    public static final int sobrepeso = 1;

    private static final char sexoDefecto = 'H';


    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;


    public Persona(String nombre) {
        this.nombre = nombre;
        this.sexo = sexoDefecto;
        this.dni = generaDNI();
    }


    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generaDNI();
    }


    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni = generaDNI();
    }


    public int calcularIMC() {
        if (altura <= 0) {
            return pesoBajo;
        }

        double imc = peso / (altura * altura);

        if (imc < 20) {
            return pesoBajo;
        } else if (imc <= 25) {
            return pesoNormal;
        } else {
            return sobrepeso;
        }
    }


    public boolean esMayorDeEdad() {
        return edad >= 18;
    }


    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        }
        return sexoDefecto;
    }


    private String generaDNI() {
        int numero = (int) (Math.random() * 100000000);
        char[] letras = {
                'T','R','W','A','G','M','Y','F','P','D','X',
                'B','N','J','Z','S','Q','V','H','L','C','K','E'
        };
        char letra = letras[numero % 23];
        return numero + "" + letra;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

