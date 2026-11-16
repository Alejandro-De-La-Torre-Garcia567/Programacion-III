import M.*;
import V.*;
import C.*;


public class Principal{



    public static void main(String args[]){

        Controlador c=new Controlador();
        Modelo m=new Modelo();
        Vista v=new Vista();


        c.run(m,v);


    }
}