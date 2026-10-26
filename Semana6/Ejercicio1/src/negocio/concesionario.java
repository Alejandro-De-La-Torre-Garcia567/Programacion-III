package negocio;
import coche.Coche;
import java.util.ArrayList;

public class Concesionario {

    ArrayList<Coche> lista = new ArrayList<Coche>();

 
    

public void añadirLista(Coche ch){

    lista.add(ch);
}


public void imprimirLista(){

    int i=1;


    for(Coche p: lista){

        System.out.printf("Vehículo %d: %s %s %F",i,p.getModelo(),p.getMatricula(),p.getPrecio());
        i++;
    }


}

}


