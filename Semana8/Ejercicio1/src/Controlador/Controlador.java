package Controlador;
import es.usal.progiii.tools.Esdia;
import Modelo.*;
import Vista.*;


/**
 * Clase que resuelve el ejercicio de mostrar los partidos del pleno al 15,
 * pedir los resultados y mostrar finalmente la quiniela.
 * 
 * Utilizar POO para su resolución creando clases que modelen el problema.
 * 
 */

public class Controlador {

    public void run(Vista vista, Modelo modelo) {


        for (int i = 0; i <modelo.getNumeroPartidos() ;i++){

            vista.showMessage("\n--- PARTIDO " + (i + 1) + " ---");

            // Pedir datos del partido
            String equipoLocal = Esdia.readString("Introduce el equipo local: ");
            String equipoVisitante = Esdia.readString("Introduce el equipo visitante: ");
            int golesLocal = Esdia.readInt("Introduce los goles del equipo local: ");
            int golesVisitante = Esdia.readInt("Introduce los goles del equipo visitante: ");

            // Crear el partido
            modelo.añadirPartido(equipoLocal, equipoVisitante, golesLocal, golesVisitante);


        }

        // Mostrar la quiniela
      
        vista.mostrarQuiniela(modelo.crearTabla());
        
        if(modelo.crearTabla().equals("Tabla creada correctamente"));
        vista.mostrarQuiniela(modelo.obtenerTabla());

    }
}