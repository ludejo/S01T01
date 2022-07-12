package n1e1;

public class InstrumentVent extends Instrument {


    static {
        System.out.println("Carregant classe InstrumentVent");
    }

    private static String tipus = "vent";

    public InstrumentVent(String nom, double preu) {
        super(nom, preu);
    }

    public static String getTipus() {
        return tipus;
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}
