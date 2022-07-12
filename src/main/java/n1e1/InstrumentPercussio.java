package n1e1;

public class InstrumentPercussio extends Instrument {

    static {
        System.out.println("Carregant classe InstrumentPercussio");
    }
    private static String tipus = "percussió";

    public InstrumentPercussio(String nom, double preu) {
        super(nom, preu);
    }

    public static String getTipus() {
        return tipus;
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
