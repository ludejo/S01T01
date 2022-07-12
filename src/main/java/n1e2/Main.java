package n1e2;

public class Main {
    public static void main(String[] args) {

        // Dels tres camps només podem passar
        Cotxe cotxe1 = new Cotxe(300);
        // Com que és static però no és final podem modificar el model
        Cotxe.setModel("Golf");

        // Invoquem mètode estàtic
        Cotxe.frenar();

        // Inovquem mètode no estàtic
        cotxe1.accelerar();
    }
}
