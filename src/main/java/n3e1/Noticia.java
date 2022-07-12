package n3e1;

public class Noticia {
    private String titular;
    private String text;
    protected int puntuacio;
    protected int preu;

    public Noticia(String titular, String text, int puntuacio, int preu) {
        this.titular = titular;
        this.text = text;
        this.puntuacio = puntuacio;
        this.preu = preu;
    }

    public Noticia(String titular) {
        this.titular = titular;
        this.text = "";
        this.puntuacio = 0;
        this.preu = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public void calcularPreuNoticia() {
        preu = 0;
    }

    public void calcularPuntuacioNoticia() {
        puntuacio = 0;
    }
}
