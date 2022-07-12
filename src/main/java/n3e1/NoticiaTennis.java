package n3e1;

public class NoticiaTennis extends Noticia {
    private String competicio;
    private String jugador;

    public NoticiaTennis(String titular, String competicio, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.jugador = jugador;
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    @Override
    public void calcularPreuNoticia() {
        preu = 150;
        if (jugador.equals("Federer") || jugador.equals("Nadal") || jugador.equals("Djokovic")) {
            preu += 100;
        }
    }

    @Override
    public void calcularPuntuacioNoticia() {
        puntuacio = 4;
        if (jugador.equals("Federer") || jugador.equals("Nadal") || jugador.equals("Djokovic")) {
            puntuacio += 3;
        }
    }
}
