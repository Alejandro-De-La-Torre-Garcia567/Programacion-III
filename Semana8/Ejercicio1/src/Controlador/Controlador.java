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

        this.vista.setControlador(this);
    }


    public void init(){

        vista.initV();
        vista.mostrarQuiniela();

    }

    public void añadirPartido(Partido p) {


            modelo.añadirPartido(p);

        }

        // Mostrar la quiniela
    
    public int getPartidos(){

       return modelo.getNumeroPartidos();

    }

    public int crearTabla(){

        return modelo.crearTabla();
    }

    public Quiniela getQuiniela(){


        return modelo.getQuiniela();

    }

    }
