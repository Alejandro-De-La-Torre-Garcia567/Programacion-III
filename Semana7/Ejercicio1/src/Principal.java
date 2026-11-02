import Modelo.Modelo;
import Vista.Vista;
import Controlador.Controlador;


public class Principal{


    public static void main(String args[]){

        Modelo modelo=new Modelo();
        Vista vista=new Vista();
        Controlador controlador= new Controlador(vista,modelo);

        controlador.run();

    }
}