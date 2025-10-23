public class OperadorTemario {
    public static void main(String[] args) {

        boolean tengoEfectivo = false;
        boolean tengoTarjeta = true;

        String puedoPagar = tengoEfectivo && tengoTarjeta ? "Si" : "No" ;
        System.out.println("Puedo pagar " + puedoPagar);
    }
}
