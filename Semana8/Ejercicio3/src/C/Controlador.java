package C;
import M.*;
import V.*;

public class Controlador {


    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo m,Vista v){

        this.modelo=m;
        this.vista=v;
    }

    public void run(){

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

            vista.showMessage(modelo.exportarHTML());

        }else if(o==4){

           vista.showMessage(modelo.exportarCSV());

        }else if (o==5){

           vista.exit(); 

        }else

            vista.wrongOption();
    
        }while(o!=5);

    }

}
