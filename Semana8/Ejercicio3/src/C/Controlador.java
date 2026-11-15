package C;
import M.*;
import V.*;

public class Controlador {



    public void run(Modelo modelo, Vista vista){

        modelo.importarFacturaTSV();
        
        int o;

        do{
        
        vista.showMenu();
        o=vista.getUserOption();


        if(o==1){

            modelo.valorMinimoClientes(vista.getUserImport());
           vista.mostrarLista(modelo.listaToString());


        }else if(o==2){

            vista.mostrarLista(modelo.listadeFacturas());

        }else if(o==3){



        }else if(o==4){



        }else if (o==5){

           vista.exit(); 

        }else

            vista.wrongOption();
    
        }while(o!=5);

    }

}
