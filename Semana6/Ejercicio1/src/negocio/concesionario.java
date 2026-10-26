package negocio;
import coche.Coche;
import java.util.ArrayList;

public class Concesionario {

   private ArrayList<Coche> lista = new ArrayList<Coche>();


public void añadirLista(Coche ch){

    lista.add(ch);
}


public void imprimirLista(){

    int i=1;


    for(Coche p: lista){

        System.out.printf("Vehículo %d: %s %s %.2f\n\n",i,p.getModelo(),p.getMatricula(),p.getPrecio());
        i++;
    }


}

public int buscarCoche(String matricula){


   int i;

    for(i=0;i<lista.size();i++){

        if(lista.get(i).getMatricula().equalsIgnoreCase(matricula)){
        
            return i;
        }

    }

            return -1;
}

public int actualizarCoche(String matricula,String modelo, double precio,String matricula1){

    int i;

    for(i=0;i<lista.size();i++){

        if(lista.get(i).getMatricula().equalsIgnoreCase(matricula)){


            lista.get(i).setPrecio(precio);
            lista.get(i).setModelo(modelo);
            lista.get(i).setMatricula(matricula1);

            return 1;

        }


    }


    return -1;
}


public int eliminarCoche(String matricula){

    int i;


    for(i=0;i<lista.size();i++){

        if(lista.get(i).getMatricula().equalsIgnoreCase(matricula)){

            lista.remove(i);

            return 1;

        }

    }


    return -1;

}



}


