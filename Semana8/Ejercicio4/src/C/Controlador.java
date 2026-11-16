package C;
import M.*;
import V.*;

public class Controlador {



    public void run(Modelo m, Vista v){

        int o;

        v.showMessage(m.leerDatos());

        do{

            v.showMenu();
            o=v.getUserOption();

            if(o==1){

                m.leerArchivo(v.getUserPath());

            }else if(o==2){




            }else if(o==3){

                v.exit();


            }else if(o==-1){

                continue;

            }else


                v.wrongOption();


        }while(o!=3);

    }

}
