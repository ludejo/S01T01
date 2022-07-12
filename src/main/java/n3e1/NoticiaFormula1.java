package n3e1;

public class NoticiaFormula1 extends Noticia {
    private String escuderia;

    public NoticiaFormula1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public void calcularPreuNoticia() {
        preu = 100;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
            puntuacio += 50;
        }
    }

    @Override
    public void calcularPuntuacioNoticia() {
        puntuacio = 4;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
            puntuacio += 2;
        }
    }
}
