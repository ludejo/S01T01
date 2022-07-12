package n1e2;

public class Cotxe {
    private static final String marca = "Volkswagen";
    private static String model;
    private final int potencia;

    public Cotxe(int potencia) {
        this.potencia = potencia;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public int getPotencia() {
        return potencia;
    }

    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }


}
