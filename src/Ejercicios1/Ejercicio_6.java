package Ejercicios1;

public class Ejercicio_6 {
    public static void main(String[] args) {
        double variableN = 5.22;
        int variableB = 10;
        char variableC = 'C';
        int variable4 = (int) variableC;
        double resultado = 0;

        //Suma
        resultado = variableN + variableB;
        System.out.println("La suma de variableN + variableB es = " + resultado);

        //Resta
        resultado = variableB - variableN;
        System.out.println("La resta de variableB - variableN = " + resultado);

        //Valor numérico
        System.out.println("el valor numerico de C es =  " + variable4);
    }
}
