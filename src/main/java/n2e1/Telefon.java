package n2e1;

public class Telefon {
    private final String marca;
    private final String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    void trucar(String numTelefon) {
        System.out.println("Trucant al número " + numTelefon);
    }
}
