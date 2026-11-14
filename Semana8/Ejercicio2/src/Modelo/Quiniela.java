package Modelo;
/**
 * 
 * Clase que representa la quiniela
 * 
 */
public class Quiniela {

    // Atributos
    final int NUMERO_PARTIDOS = 15;
    private Partido[]partidos=new Partido[NUMERO_PARTIDOS];
    private int i=0;
    // Constructores

    public String crearTabla() {

        // Check if the number of matches is correct
        if (partidos.length != NUMERO_PARTIDOS) {
            return "El número de partidos es incorrecto";
        }else  
        this.partidos = partidos;
        return "Tabla creada correctamente";
    }


    // Obtener tabla de la quiniela
    public String obtenerTablaQuiniela() {
        String tabla = "";

        // Cabecera de la tabla a partir de las columnas de la clase partido
        int toltalLength = Partido.COLUMNAS[0] + Partido.COLUMNAS[1] + Partido.COLUMNAS[2] + 10; // 4 barras y 6 espacios
        String lineaCabecera = "|"+" ".repeat((toltalLength-10)/2)+"QUINIELA"+" ".repeat((toltalLength-10)/2)+"|";
        String lineaSeparacion = "+" + "-".repeat(toltalLength-3) + "+";
        tabla += lineaSeparacion + "\n";
        tabla += lineaCabecera + "\n";
        tabla += lineaSeparacion + "\n";

        // Lineas de partidos
        for (Partido partido : partidos) {
            tabla += partido + "\n";
        }
        tabla += lineaSeparacion + "\n";
        return tabla;
    }

    public void añadirPartido(Partido p){


        partidos[i]=p;
        i++;
    }


}   
