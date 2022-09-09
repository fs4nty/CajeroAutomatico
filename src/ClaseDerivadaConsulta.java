public class ClaseDerivadaConsulta extends ClaseBaseAbstracta {

    @Override
    public void transacciones() {
        System.out.println("---------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }
}
