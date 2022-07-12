package n3e1;

public class NoticiaBasquet extends Noticia {
    private String competicio;
    private String club;

    public NoticiaBasquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public void calcularPreuNoticia() {
        preu = 250;
        if (competicio.equals("Eurolliga")) {
            preu += 75;
        }
        if (club.equals("Barça") || club.equals("Madrid")) {
            preu += 75;
        }
    }

    @Override
    public void calcularPuntuacioNoticia() {
        puntuacio = 4;
        if (competicio.equals("Eurolliga")) {
            puntuacio += 3;
        }
        if (competicio.equals("ACB")) {
            puntuacio += 2;
        }
        if (club.equals("Barça") || club.equals("Madrid")) {
            puntuacio += 1;
        }
    }
}
