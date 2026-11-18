package Controlador;
import Modelo.Modelo;
import Vista.Vista;


public class Controlador {

    Vista v;
    Modelo m;

    public Controlador(Vista v, Modelo m){

        this.v=v;
        this.m=m;

        this.v.setControlador(this);
    }


    public void init(){

        v.initMenu();

    }


    public int showRessult(){

        return m.getSuma();

    }


    public void calculateSum(){

        m.calcularSuma();

    }



    public void setNum1(int i){

        m.setNum1(i);
    }



    public void setNum2(int i){

        m.setNum2(i);

    }

}
