package C;
import M.*;
import V.*;
import java.util.List;

public class Controlador {


    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo m,Vista v){

        this.modelo=m;
        this.vista=v;
    }


    public void init(){

        if(modelo.importarFacturaTSV()==1){

            System.out.println("Se han cargado las facturas correctamente");
        
        
        }else
            System.out.println("Ha ocurrido un error al cargar las facturas");

        vista.initMenu();
        
    }


    public int minimumValue(float n){

        return modelo.valorMinimoClientes(n);

    }


    public int exportToHtml(){

        return modelo.exportarHTML();
    }


    public int exportToCSV(){

        return modelo.exportarCSV();
    }


    public List<Factura> getFacturas(){


        return modelo.getFacturas();
    }





}
