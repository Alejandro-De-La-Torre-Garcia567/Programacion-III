package Modelo;

/**
 * Representa una quiniela con sus 15 partidos.
 */
public class Quiniela {

    private static final int NUMERO_PARTIDOS = 15;

    private final Partido[] partidos = new Partido[NUMERO_PARTIDOS];
    private int partidosRegistrados = 0;

    public boolean añadirPartido(Partido partido) {
        if (partido == null || partidosRegistrados >= partidos.length) {
            return false;
        }

        partidos[partidosRegistrados] = partido;
        partidosRegistrados++;
        return true;
    }

    public boolean estaCompleta() {
        return partidosRegistrados == partidos.length;
    }

    public String obtenerTablaQuiniela() {
        if (!estaCompleta()) {
            return "La quiniela está incompleta: hay " + partidosRegistrados
                    + " de " + partidos.length + " partidos.";
        }

        int longitud = Partido.COLUMNAS[0] + Partido.COLUMNAS[1] + 10;
        int espaciosTitulo = longitud - 2 - "QUINIELA".length();
        int espaciosIzquierda = espaciosTitulo / 2;
        int espaciosDerecha = espaciosTitulo - espaciosIzquierda;

        String separador = "+" + "-".repeat(longitud - 2) + "+";
        String cabecera = "|" + " ".repeat(espaciosIzquierda) + "QUINIELA"
                + " ".repeat(espaciosDerecha) + "|";

        StringBuilder tabla = new StringBuilder();
        tabla.append(separador).append(System.lineSeparator());
        tabla.append(cabecera).append(System.lineSeparator());
        tabla.append(separador).append(System.lineSeparator());

        for (int i = 0; i < partidosRegistrados; i++) {
            Partido partido = partidos[i];
            tabla.append(partido.getPartido())
                    .append(" : ")
                    .append(partido.getResultado())
                    .append(System.lineSeparator());
        }

        tabla.append(separador).append(System.lineSeparator());
        return tabla.toString();
    }
}