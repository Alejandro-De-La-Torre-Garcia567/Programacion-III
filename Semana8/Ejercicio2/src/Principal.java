import Modelo.*;
import Controlador.*;
import Vista.*; 


public class Principal {

    public static void main (String[] args){

        Vista v=new Vista();
        Modelo m=new Modelo();
        Controlador c= new Controlador(m,v);

        c.run();

    }

}
