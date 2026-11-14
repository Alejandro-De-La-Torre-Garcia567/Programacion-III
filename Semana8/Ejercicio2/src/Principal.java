import Modelo.*;
import Controlador.*;
import Vista.*; 


public class Principal {

    public static void main (String[] args){

        Controlador c= new Controlador();
        Vista v=new Vista();
        Modelo m=new Modelo();

        c.run(v,m);

    }

}
