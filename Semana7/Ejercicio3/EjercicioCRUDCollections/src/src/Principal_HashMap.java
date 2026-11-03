package src;
import src.MVC_HashMap.V.*;
import src.MVC_HashMap.M.*;
import src.MVC_HashMap.C.*;

public class Principal_HashMap {

   

    public static void main (String args[]){

    ModeloHashMap modelo= new ModeloHashMap();
    VistaHashMap vista= new VistaHashMap();
    ControladorHashMap controlador= new ControladorHashMap();

    controlador.run(modelo,vista);

    }

}
