package n1e1;

public class InstrumentCorda extends Instrument {

    static {
        System.out.println("Carregant classe InstrumentCorda");
    }
    private static String tipus = "corda";

    public InstrumentCorda(String nom, double preu) {
        super(nom, preu);
    }

    public static String getTipus() {
        return tipus;
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
