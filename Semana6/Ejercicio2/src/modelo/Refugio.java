package modelo;
import java.util.ArrayList;
import modelo.Animal;

public class Refugio {


    private ArrayList<Animal> animales= new ArrayList<>();
    private float precio;

    public Refugio(){

        this.precio=3;

    }

    public float calcularPesoMedio(){

        int i;
        float peso=0;

        if(animales.size()==0){

            System.out.printf("Error: no hay animales registrados en el refugio\n\n");
            return 0;
        }

        for(i=0;i<animales.size();i++){

            peso+=animales.get(i).getPeso();

        }

        return peso/animales.size();
    }


    public float calcularCosteDiarioTotal(){

        int i;
        float coste=0;

        for(i=0;i<animales.size();i++){

            coste+=this.precio*animales.get(i).getConsumo();
            
        }

        return coste;


    }

       public float calcularCosteDiario(int i){

           return this.precio*animales.get(i).getConsumo();


    }

    public boolean existeRegistro(){ return animales!=null;}


    public void setPrecio(float p){

        if(p<=0){

            System.out.printf("Error: el precio no puede ser negativo\n\n");
            return;

        }

        this.precio=p;

    }



    public void añadirAnimal(Animal a){
    
        this.animales.add(a);

    }



    public void mostrarAnimales(){
        int i;

        if(animales.size() == 0){

            System.out.printf("No hay animales registrados en el refugio\n\n");
            return;
        }


    System.out.printf("|--------------------------------------------------------------------------------------------|\n");
    System.out.printf("| ANIMALES DEL REFUGIO                                                                       |\n");
    System.out.printf("|--------------------------------------------------------------------------------------------|\n");            
    System.out.printf("| Nombre  | Especie | Cuidador        | Formación | Peso  (kg)  | Consumo (kg)  | Coste EUR  |\n");       
    System.out.printf("|--------------------------------------------------------------------------------------------|\n");            



    for(i=0;i<animales.size();i++){
    
    System.out.printf("| %-8s | %-8s | %s %8s | %s | %-8.2f | %-8.2f | %-8.2f                  |\n", animales.get(i).getNombre(), animales.get(i).getEspecie(), animales.get(i).getNombreC(),animales.get(i).getApellidosC(), animales.get(i).getFormacion(),animales.get(i).getPeso(),animales.get(i).getConsumo(),calcularCosteDiario(i));

    

    }

    System.out.printf("|--------------------------------------------------------------------------------------------|\n");
    System.out.printf("| Coste diario total de alimentación: %.2f EUR                                              |\n", calcularCosteDiarioTotal());            
    System.out.printf("| Peso medio de los animales: %.2f kg                                                       |\n",calcularPesoMedio());            
    System.out.printf("|--------------------------------------------------------------------------------------------|\n\n\n");            

    
    
    }



}
