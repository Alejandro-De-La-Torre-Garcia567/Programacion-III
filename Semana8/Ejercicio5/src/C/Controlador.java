package C;
import M.*;
import V.*;

public class Controlador {

    private Modelo m;
    private Vista v;



    public Controlador(Modelo m, Vista v){

        this.m=m;
        this.v=v;
    }

    public void run(){

        v.showMessage(m.crearAlumnos());

        String o;

        do{

            v.showMenu();

            o=v.getUserOption();

            if(o.equals("1")){

            v.showMessage(m.crearAlumnos());
 
            }else if(o.equals("2")){

                v.showMessage(m.mostrarTabla());

            }else if(o.equals("3")){

                v.showMessage(m.exportarDatosCSV());

            }else if(o.equals("4")){

                v.showMessage(m.exportarDireccionesCSV());


            }else

                v.wrongOption();

        }while(!o.equals("q"));
        


    }



}
