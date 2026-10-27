package negocio;
import coche.Coche;
public class Concesionario {

   private Coche[] lista;
   private int i;
   private boolean existe;




public Concesionario(){

    this.existe=false;
    this.i=0;
}

public boolean getExiste(){

    return this.existe;
}


public int getContador(){

    return this.i;
}

public void setLista(int n){

    if(n<=0){

        System.out.printf("No se puede crear un registro de tamaño menor a cero");
        return;
    }

    this.existe=true;
    this.lista= new Coche[n];

}




public void añadirCoche(Coche c){

    if(i==lista.length){

        System.out.printf("El registro está lleno");
        return;
    }

    lista[i]=c;
    this.i++;
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

    for(i=0;i<this.i;i++){

        if(lista[i].getMatricula().equalsIgnoreCase(matricula)){
        
            return i;
        }

    }

            System.out.printf("No se ha encontrado un coche con esa matrícula");
            return -1;
}

public int actualizarCoche(String matricula,String modelo, double precio,String matricula1){

    int i;

    for(i=0;i<this.i;i++){

        if(lista[i].getMatricula().equalsIgnoreCase(matricula)){


            lista[i].setPrecio(precio);
            lista[i].setModelo(modelo);
            lista[i].setMatricula(matricula1);

            return 1;

        }


    }

    System.out.printf("No se ha encontrado un vehículo con esa matrícula");
    return -1;
}


public int eliminarCoche(String matricula){

    int i;


    for(i=0;i<this.i;i++){

        if(lista[i].getMatricula().equalsIgnoreCase(matricula)){


            for(;i<this.i-1;i++){
            lista[i]=lista[i+1];

                }

            return 1;

        }

    }

    System.out.printf("No se ha encontrado un vehículo con esa matrícula en el sistema");

    return -1;

}



}


