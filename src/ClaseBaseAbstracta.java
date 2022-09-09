import java.util.Scanner;

public abstract class ClaseBaseAbstracta {

    Scanner in = new Scanner(System.in);
    protected int transacciones, retiro, deposito;
    private static int saldo;

    public void bienvenida(){
        System.out.println("-----------------------------");
        System.out.println("BIENVENIDO AL CAJERO FS0CIETY");
        System.out.println("-----------------------------");
    }
    public void operaciones() {
        //bandera es una variable que cambia su valor dependiendo del flujo del programa.
        int bandera = 0;
        int seleccion = 0;

        do {
            do { //ciclado para que cuando se ingrese una opcion incorrecta, se siga ejecutando el menu.
                System.out.println("Porfavor seleccione una opcion:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. exit");
                seleccion = in.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("-------------------------------------");
                    System.out.println("Opcion incorrecta, vuelva a intentar.");
                    System.out.println("-------------------------------------");
                }
            } while (bandera == 0);

            ClaseBaseAbstracta mensajero;

            switch (seleccion) {
                case 1:
                    mensajero = new ClaseDerivadaConsulta();
                    mensajero.transacciones();
                    break;
                case 2:
                    mensajero = new ClaseDerivadaRetiro();
                    mensajero.transacciones();
                    break;
                case 3:
                    mensajero = new ClaseDerivadaDeposito();
                    mensajero.transacciones();
                    break;
                case 4:
                    System.out.println("-----------------------");
                    System.out.println("Gracias, vuelva pronto.");
                    System.out.println("-----------------------");
                    bandera = 2;
                    break;

            }
        } while (bandera != 2);
    }

    //metodo para solicitar cantidad de retiro.
    public void retiro() {
        retiro = in.nextInt();
    }

    //metodo para solicitar deposito.
    public void deposito() {
        deposito = in.nextInt();
    }

    //metodo abstracto.
    public abstract void transacciones();

    //metodos setter y getter.
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {

        this.saldo = saldo;
    }

}
