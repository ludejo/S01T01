package n3e1;

public class NoticiaFutbol extends Noticia {
    private String competicio;
    private String club;
    private String jugador;

    public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public void calcularPreuNoticia() {
        preu = 300;
        if (competicio.equals("Lliga de Campions")) {
            preu += 100;
        }
        if (club.equals("Barça") || club.equals("Madrid")) {
            preu += 100;
        }
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
            preu += 50;
        }
    }

    @Override
    public void calcularPuntuacioNoticia() {
        puntuacio = 5;
        if (competicio.equals("Lliga de Campions")) {
            puntuacio += 3;
        }
        if (competicio.equals("Lliga")) {
            puntuacio += 2;
        }
        if (club.equals("Barça") || club.equals("Madrid")) {
            puntuacio += 1;
        }
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
            puntuacio += 1;
        }
    }
}
