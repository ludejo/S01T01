package n3e1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Redactor> redaccio = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int input;
        String inDni;

        do {
            System.out.println("Sistema de gestió de notícies");
            System.out.println("Selecciona una opció:" +
                    "\n\t[1] Introduir redactor" +
                    "\n\t[2] Eliminar redactor" +
                    "\n\t[3] Introduir notícia a un redactor" +
                    "\n\t[4] Eliminar una notícia" +
                    "\n\t[5] Mostrar totes les notícies per redactor" +
                    "\n\t[6] Calcular puntuació de la notícia" +
                    "\n\t[7] Calcular preu-notícia" +
                    "\n\t[0] Sortir de l'aplicació");

            input = in.nextInt();

            switch (input) {
                case 1:
                    afegirRedactor();
                    break;
                case 2:
                    eliminarRedactor();
                    break;
                case 3:
                    crearNoticia();
                    break;
                case 4:
                    eliminarNoticia();
                    break;
                case 5:
                    mostrarNoticiesRedactor();
                    break;
                case 6:
                    calcularPuntuacioNoticia();
                    break;
                case 7:
                    calcularPreuNoticia();
                    break;
            }
        }
        while (input != 0);

    }

    public static void afegirRedactor() {
        String inNom = preguntarString("Nom del nou redactor: ");
        String inDni = preguntarString("DNI del nou redactor: ");
        int cercDni = cercarRedactor(inDni, false);
        if (cercDni != -1) {
            System.out.printf("El redactor amb DNI <%s> JA existeix al sistema\n", inDni);
        } else {
            redaccio.add(new Redactor(inNom, inDni));
        }
    }

    public static void eliminarRedactor() {
        String inDni = preguntarString("DNI del nou redactor: ");
        int cercDni = cercarRedactor(inDni, true);
        if (cercDni != -1) {
            redaccio.remove(cercDni);
        }
    }

    public static void crearNoticia() {
        String inDni = preguntarString("DNI del redactor a qui afegir la notícia: ");
        int cercDni = cercarRedactor(inDni, true);

        if (cercDni != -1) {
            int option = preguntarInt("Selecciona el tipus de notícia: " +
                    "\n\t[1] Futbol" +
                    "\n\t[2] Bàsquet" +
                    "\n\t[3] Tennis" +
                    "\n\t[4] Formula 1" +
                    "\n\t[5] Motociclisme");
            String titular = preguntarString("Titular de la notícia: ");
            int cercTitular = redaccio.get(cercDni).cercarByline(titular, true);
            if (cercTitular == -1) {
                switch (option) {
                    case 1:
                        String competicio = preguntarString("Competició: ");
                        String club = preguntarString("Club: ");
                        String jugador = preguntarString("Jugador: ");
                        redaccio.get(cercDni).afegirByline(new NoticiaFutbol(titular, competicio, club, jugador));
                        break;
                    case 2:
                        String competicioBasquet = preguntarString("Competició: ");
                        String clubBasquet = preguntarString("Club: ");
                        redaccio.get(cercDni).afegirByline(new NoticiaBasquet(titular, competicioBasquet, clubBasquet));
                        break;
                    case 3:
                        String torneig = preguntarString("Torneig de tennis: ");
                        String jugadorTennis = preguntarString("Tennista: ");
                        redaccio.get(cercDni).afegirByline(new NoticiaTennis(titular, torneig, jugadorTennis));
                        break;
                    case 4:
                        String escuderia = preguntarString("Escuderia: ");
                        redaccio.get(cercDni).afegirByline(new NoticiaFormula1(titular, escuderia));
                        break;
                    case 5:
                        String equip = preguntarString("Equip: ");
                        redaccio.get(cercDni).afegirByline(new NoticiaMotociclisme(titular, equip));
                        break;
                }
            }
        }
    }

    public static void eliminarNoticia() {
        String inDni = preguntarString("DNI del redactor: ");
        int indexRedactor = cercarRedactor(inDni, true);
        if (indexRedactor != -1) {
            String inTitular = preguntarString("Titular de la notícia: ");
            redaccio.get(indexRedactor).eliminarByline(inTitular);
        }
    }

    public static void mostrarNoticiesRedactor() {
        String inDni = preguntarString("DNI del redactor: ");
        int indexRedactor = cercarRedactor(inDni, true);
        if (indexRedactor != -1) {
            redaccio.get(indexRedactor).mostrarNoticies();
        }
    }

    public static void calcularPreuNoticia() {
        String inDni = preguntarString("DNI del redactor: ");
        int indexRedactor = cercarRedactor(inDni, true);
        if (indexRedactor != -1) {
            String inTitular = preguntarString("Titular de la notícia: ");
            redaccio.get(indexRedactor).actualitzarPreuNoticia(inTitular);
        }
    }

    public static void calcularPuntuacioNoticia() {
        String inDni = preguntarString("DNI del redactor: ");
        int indexRedactor = cercarRedactor(inDni, true);
        if (indexRedactor != -1) {
            String inTitular = preguntarString("Titular de la notícia: ");
            redaccio.get(indexRedactor).actualitzarPuntuacioNoticia(inTitular);
        }
    }


    // AUXILIARS

    static String preguntarString(String pregunta) {
        System.out.println(pregunta);
        return in.next();
    }

    static int preguntarInt(String pregunta) {
        System.out.println(pregunta);
        return in.nextInt();
    }

    static int cercarRedactor(String dni, boolean avis) {
        int index = -1;
        int rec = 0;
        while (index == -1 && rec < redaccio.size()) {
            if (redaccio.get(rec).getDni().equals(dni)) {
                index = rec;
            } else {
                rec++;
            }
        }
        if (index == -1 & avis) {
            System.out.printf("El redactor amb DNI <%s> NO existeix al sistema\n", dni);
        }
        return index;
    }


}
