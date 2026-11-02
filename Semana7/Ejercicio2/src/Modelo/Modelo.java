package Modelo;
import java.util.ArrayList;

public class Modelo {


    public ArrayList<Almacen> lista= new ArrayList<>();


    public void setAlmacen(){
        lista.add(new Almacen());
    }

    public void setUnidades1(int u1, int a){

        lista.get(a).setUnidades1(u1);
        
    }

    public void setUnidades2(int u2, int a){

        lista.get(a).setUnidades2();
        
    }

    public void setPrecio1(double p1, int a){

        lista.get(a).setPrecio1(p1);
    }


    public void setPrecio2(double p2, int a){

        lista.get(a).setPrecio2(p2);

    }


    

}






class Almacen{

    static double precio1,precio2;
    private int unidades1,unidades2;


    static void setPrecio1(double p1){

        precio1=p1;
       
    }

    static void setPrecio2(double p2){

        precio2=p2;
       
    }
    
    public void setUnidades1(int u1){

        this.unidades1=u1;
    }


    public void setUnidades2(int u2){

        this.unidades2=u2;
    }

    
    static double getPrecio1(){

    return precio1;
       
    }

    static double getPrecio2(){

    return precio2;
       
    }

    public int setUnidades1(){

       return this.unidades1;
    }

    public int setUnidades2(){

       return this.unidades2;
    }


}
