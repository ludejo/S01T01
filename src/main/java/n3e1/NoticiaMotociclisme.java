package n3e1;

public class NoticiaMotociclisme extends Noticia {
    private String equip;

    public NoticiaMotociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    @Override
    public void calcularPreuNoticia() {
        preu = 100;
        if (equip.equals("Honda") || equip.equals("Yamaha")) {
            puntuacio += 50;
        }
    }

    @Override
    public void calcularPuntuacioNoticia() {
        puntuacio = 3;
        if (equip.equals("Honda") || equip.equals("Yamaha")) {
            puntuacio += 3;
        }
    }
}
