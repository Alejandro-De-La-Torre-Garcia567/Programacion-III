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

    public void run(Vista vista, Modelo modelo) {

        if(modelo.leerArchivo()==0){

            vista.showMessage("Se ha  leido el archivo correctamente");
        }else{

            vista.showMessage("No se ha podido leer el archivo");
        }


        for (int i = 0; i <modelo.getNumeroPartidos() ;i++){

            vista.showMessage("\n--- PARTIDO " + (i + 1) + " ---");

            // Crear el partido

            vista.showMessage(modelo.obtenerPartido());
            modelo.crearPartido(vista.getGolesLocal(),vista.getGolesVisitante());


        }

        // Mostrar la quiniela
      
        vista.mostrarQuiniela(modelo.crearTabla());
        
        if(modelo.crearTabla().equals("Tabla creada correctamente"))
        vista.mostrarQuiniela(modelo.obtenerTabla());

    }
}