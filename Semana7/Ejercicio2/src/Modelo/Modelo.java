package Modelo;


import java.util.ArrayList;

public class Modelo{


    private ArrayList<Almacen> lista=new ArrayList<>();



    private double precio1;
    private double precio2;
    private double ingresosTotales;


    public void setAlmacen(){

        lista.add(new Almacen());
    }

    public void deleteAlmacen(){

        lista.clear();
    }

    public void setPrecio1(double precio){

        this.precio1=precio;

    }

    public void setPrecio2(double precio){

        this.precio2=precio;
    }


    public double getPrecio1(){

        return precio1;

    }


    
    public double getPrecio2(){

        return precio2;

    }

    public void setUnidades1(int unidades, int almacen){


        lista.get(almacen).setUnidades1(unidades);
    }


    public void setUnidades2(int unidades, int almacen){


        lista.get(almacen).setUnidades2(unidades);
    }


    public int getUnidades1(int almacen){

        return lista.get(almacen).getUnidades1();
    }


    public int getUnidades2(int almacen){

        return lista.get(almacen).getUnidades2();
    }


    public double getIngresos1(int almacen){

        return lista.get(almacen).getIngresos1();
    }


    public double getIngresos2(int almacen){

        return lista.get(almacen).getIngresos2();
    }


    public void calcularIngresos1(int almacen){


        lista.get(almacen).calcularIngresos1(precio1);
    }



    public void calcularIngresos2(int almacen){

        lista.get(almacen).calcularIngresos1(precio2);
    }


    public void calcularIngresosTotales(){

        double total=0;

        for(int i=0;i<5;i++){

            total+=lista.get(i).getIngresos1()+lista.get(i).getIngresos2();
        }


        ingresosTotales=total;
    }

    public double getIngresosTotales(){

        return ingresosTotales;
    }



}