package C;
import M.*;
import V.*;

public class Controlador {

    private Modelo m;
    private Vista v;


    public Controlador(Modelo m, Vista v){

        this.v=v;
        this.m=m;

    }

    public void run(){

        int o;

        v.showMessage(m.leerDatos());

        do{

            v.showMenu();
            o=v.getUserOption();

            if(o==1){

                v.showMessage(m.leerArchivo(v.getUserPath()));

            }else if(o==2){

                v.showTable(m.crearTabla());


            }else if(o==3){

                v.exit();


            }else if(o==-1){

                continue;

            }else


                v.wrongOption();


        }while(o!=3);

    }

}
