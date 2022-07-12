package n3e1;

import java.util.ArrayList;

public class Redactor {
    private String name;
    private String dni;
    private static double sou;
    private ArrayList<Noticia> bylines;

    public Redactor(String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.bylines = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static double getSou() {
        return sou;
    }

    public static void setSou(double sou) {
        Redactor.sou = sou;
    }

    public ArrayList<Noticia> getBylines() {
        return bylines;
    }

    public void setBylines(ArrayList<Noticia> bylines) {
        this.bylines = bylines;
    }

    public void afegirByline(Noticia not) {
        bylines.add(not);
    }

    public void eliminarByline(String titular) {
        int resultatCerca = cercarByline(titular, false);
        if (resultatCerca != -1) {
            bylines.remove(resultatCerca);
        } else {
            System.out.printf("La notícia amb titular <%s> NO existeix per al redactor <%s>", titular, dni);
        }
    }

    public void actualitzarPreuNoticia(String titular) {
        int resultatCerca = cercarByline(titular, false);
        if (resultatCerca != -1) {
            bylines.get(resultatCerca).calcularPreuNoticia();
        } else {
            System.out.printf("La notícia amb titular <%s> NO existeix per al redactor <%s>", titular, dni);
        }
    }

    public void actualitzarPuntuacioNoticia(String titular) {
        int resultatCerca = cercarByline(titular, false);
        if (resultatCerca != -1) {
            bylines.get(resultatCerca).calcularPuntuacioNoticia();
        } else {
            System.out.printf("La notícia amb titular <%s> NO existeix per al redactor <%s>", titular, dni);
        }
    }

    public void mostrarNoticies() {
        if (bylines.size() == 0) {
            System.out.printf("El redactor amb DNI %s no té notícies\n", dni);
        } else {
            for (Noticia i : bylines) {
                System.out.printf("Titular: %s -- Puntuació: %d -- Preu: %d", i.getTitular(), i.getPuntuacio(), i.getPreu());
            }
        }
    }

    public int cercarByline(String titular, boolean avis) {
        int index = -1;
        int rec = 0;
        while (index == -1 && rec < bylines.size()) {
            if (bylines.get(rec).getTitular().equals(titular)) {
                index = rec;
            } else {
                rec++;
            }
        }
        if (avis & index != -1) {
            System.out.println("La notícia amb aquest redactor i titular JA existeix");
        }
        return index;
    }

    public static void incrementarSou(double increment) {
        sou += increment;
    }
}
