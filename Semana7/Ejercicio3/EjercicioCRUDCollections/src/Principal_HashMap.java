import MVC_HashMap.V.*;
import MVC_HashMap.M.*;
import MVC_HashMap.C.*;

public class Principal_HashMap {

   

    public static void main (String args[]){

    ModeloHashMap modelo= new ModeloHashMap();
    VistaHashMap vista= new VistaHashMap();
    ControladorHashMap controlador= new ControladorHashMap();

    controlador.run(modelo,vista);

    }

}
