package Controlador;
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

    private Vista vista;
    private Modelo modelo;


    public Controlador(Modelo m, Vista v){

        this.vista=v;
        this.modelo=m;
    }

    public void run() {


        for (int i = 0; i <modelo.getNumeroPartidos() ;i++){

            vista.showMessage("\n--- PARTIDO " + (i + 1) + " ---");

            // Crear el partido
            modelo.añadirPartido(vista.getLocal(), vista.getVisitante(), vista.getGolesLocal(), vista.getGolesVisitante());


        }

        // Mostrar la quiniela
      
        vista.mostrarQuiniela(modelo.crearTabla());
        
        if(modelo.crearTabla().equals("Tabla creada correctamente"))
        vista.mostrarQuiniela(modelo.obtenerTabla());

    }
}