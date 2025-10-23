public class VariablesGTAVI {
    public static void main(String[] args) {

        long dinero = 1000000000000000000L;

        float saldo = 12345.89f;

        System.out.println(dinero);

        // NO se puede encajar decimal en entero
        // int numero = 1000.4f;

        double numero2 = 457.24f;

        double cantidad = 124;

        final int notaFinDeCurso;
        double examen1 = 7.8;
        double examen2 = 5.4;
        double media = ( 7.8 + 5.4 ) / 2;
        System.out.println("La media sería " + media);

        // CASTING - Perdemos la parte decimal

        notaFinDeCurso = (int) media;
        System.out.println("La notaFinDeCurso sería " + notaFinDeCurso);

        // Caracteres
        char inicial = 'G';
        System.out.println("Tu inicial es la " + inicial);

    }
}
