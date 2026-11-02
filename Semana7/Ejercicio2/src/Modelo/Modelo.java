package Modelo;
import java.util.ArrayList;

public class Modelo {



    private ArrayList<Almacen> lista= new ArrayList<>();

    private double precio1,precio2;

    private double ingresosTotales;

    public void setAlmacen(){
        lista.add(new Almacen());
    }

    public void deleteAlmacen(){

        lista.clear();
    }

    public void setPrecio1(double p1){

        this.precio1=p1;
       
    }

    public void setPrecio2(double p2){

        this.precio2=p2;
       
    }

    public double getPrecio1(){

    return precio1;
       
    }

    public double getPrecio2(){

    return precio2;
       
    }

    public void setUnidades1(int u1, int a){

        lista.get(a).setUnidades1(u1);
        
    }

    public void setUnidades2(int u2, int a){

        lista.get(a).setUnidades2(u2);
        
    }


    public int getUnidades1(int a){

        return lista.get(a).getUnidades1();

    }


    public int getUnidades2(int a){

    return lista.get(a).getUnidades2();

    }

    public double getIngresos1(int a){

        return lista.get(a).getIngresos1();

    }


    public double getIngresos2(int a){

        return lista.get(a).getIngresos2();

    }


    public void calcularIngresos1(int a){

        lista.get(a).calcularIngresos1(this.precio1);
    }


    public void calcularIngresos2(int a){

        lista.get(a).calcularIngresos2(this.precio2);
    }



    public void calcularIngresosTotales(){

        int i;
        double total=0;

        for(i=0;i<5;i++){

            total+=lista.get(i).getIngresos1()+lista.get(i).getIngresos2();
        }


        this.ingresosTotales=total;

    }


    public double getIngresosTotales(){

        return this.ingresosTotales;
    }
}






class Almacen{

    private int unidades1,unidades2;
    private double ingresos1, ingresos2;

    public void setUnidades1(int u1){

        this.unidades1=u1;
    }


    public void setUnidades2(int u2){

        this.unidades2=u2;
    }

    public int getUnidades1(){

       return this.unidades1;
    }

    public int getUnidades2(){

       return this.unidades2;
    }

    public void calcularIngresos1(double precio1){

        this.ingresos1= precio1* this.unidades1;
    }

    public void calcularIngresos2(double precio2){

        this.ingresos1= precio2* this.unidades2;
    }


    public double getIngresos1(){

        return this.ingresos1;
    }


    public double getIngresos2(){

        return this.ingresos2;
    }

}
