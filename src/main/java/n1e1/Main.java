package n1e1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sprint 1 - Tasca 1 - Nivell 1");

        // Declaració no carrega classe
        InstrumentPercussio triangle;

        // Declaració sense instanciació no carrega classe
        InstrumentPercussio tambor = null;

        // Accés a variable estàtica carrega classe
        System.out.println(InstrumentVent.getTipus());

        // Creació d'instància de classe carrega classe
        InstrumentCorda violi = new InstrumentCorda("Violí", 400);

        // Nova instància no torna a carregar classe
        InstrumentCorda viola = new InstrumentCorda("Viola", 500);

        // Inicialització carrega
        triangle = new InstrumentPercussio("Triangle", 50);
    }
}