import M.*;
import V.*;
import C.*;


public class Principal{

    public static void main(String[]args){

        Modelo m=new Modelo();
        Controlador c= new Controlador();
        Vista v=new Vista();


        c.run(m,v);


    }



}