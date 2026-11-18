package Modelo;

public class Almacen {

    private int unidades1;
    private int unidades2;
    private double ingresos1;
    private double ingresos2;



    public void setUnidades1(int unidades){

        this.unidades1=unidades;
    }

    public void setUnidades2(int unidades){


        this.unidades2=unidades;
    }

    public int getUnidades1(){

        return unidades1;
    }

    public int getUnidades2(){

        return unidades2;
    }


    public void calcularIngresos1(double precio1){

        ingresos1=precio1*unidades1;
    }


    public void calcularIngresos2(double precio2){

        ingresos2=precio2*unidades2;
    }


    public double getIngresos1(){

        return ingresos1;
    }

    public double getIngresos2(){

        return ingresos2;
    }


}
