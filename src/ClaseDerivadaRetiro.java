public class ClaseDerivadaRetiro extends ClaseBaseAbstracta {

    @Override
    public void transacciones() {
        System.out.print("Cuanto deseas retirar: ");
        retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("---------------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("---------------------------------");
        } else {
            System.out.println("-------------------");
            System.out.println("Saldo insuficiente.");
            System.out.println("-------------------");
        }
    }
}
