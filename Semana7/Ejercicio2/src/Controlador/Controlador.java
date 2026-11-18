package Controlador;

import Modelo.*;
import Vista.*;


public class Controlador{

    private static final int NUMERO_ALMACENES=5;

    private final Modelo m;
    private Vista v;

    private boolean ventasRegistradas=false;
    private boolean preciosRegistrados=false;
    private boolean calculosRealizados=false;

    public Controlador(Modelo m,Vista v){

        this.m=m;
        this.v=v;

        this.v.setControlador(this);
    }


    public void init(){

        v.initMenu();
    }



    public void registrarVentas(int[]producto1, int[]producto2){

        m.deleteAlmacen();

        for(int i=0;i<NUMERO_ALMACENES;i++){

            m.setAlmacen();
            m.setUnidades1(producto1[i],i);
            m.setUnidades2(producto2[i],i);

        }

        ventasRegistradas=true;
        calculosRealizados=false;

    }


    public void registrarPrecios(double precio1,double precio2){

        m.setPrecio1(precio1);
        m.setPrecio2(precio2);

        preciosRegistrados=true;
        calculosRealizados=false;

    }


    public boolean calcularIngresos(){

        if(!ventasRegistradas || !preciosRegistrados){

            return false;
        }


        for(int i=0;i<NUMERO_ALMACENES;i++){

            m.calcularIngresos1(i);
            m.calcularIngresos2(i);
        }



        m.calcularIngresosTotales();
        calculosRealizados=true;
        return true;
    }



    public boolean hayCalculosRealizados(){

        return calculosRealizados;
    }

    public double getIngresosAlmacen(int almacen){

        return m.getIngresos1(almacen)+m.getIngresos2(almacen);
    }

    public double getIngresosTotales(){


        return m.getIngresosTotales();
    }

}