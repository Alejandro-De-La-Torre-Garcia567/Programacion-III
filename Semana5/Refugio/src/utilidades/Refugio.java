package utilidades;

public class Refugio {


    private Animal [] animales;
    private static float precio;
    private int cantidad;
    private int c;


    public Refugio(){

        this.c=0;
        this.cantidad=0;
        this.precio=3;

    }

    public float calcularPesoMedio(){

        int i;
        float peso=0;

        if(this.c==0){

            System.out.printf("Error: no hay animales registrados en el refugio");
            return 0;
        }

        for(i=0;i<this.c;i++){

            peso+=animales[i].getPeso();

        }

        return peso/this.c;
    }


    public float calcularCosteDiarioTotal(){

        int i;
        float coste=0;

        for(i=0;i<this.c;i++){

            coste+=this.precio*animales[i].getConsumo();
            
        }

        return coste;


    }

       public float calcularCosteDiario(int i){

           return this.precio*animales[i].getConsumo();


    }


    public void setPrecio(float p){

        if(p<0){

            System.out.printf("Error: el precio no puede ser negativo");
            return;

        }

        this.precio=p;

    }


    public void setArray(int c){

        if(c<=0){

            System.out.printf("Error: la cantidad debe ser mayor a cero");
        return;
        }

        this.c=0;
        this.animales=new Animal[c];

    }


    public void añadirAnimal(Animal a){
    
        if(c==(animales.length)){

            System.out.printf("El registro de animales está lleno");
            return;

        }

        this.animales[c]=a;
        this.c++;
    }



    public void mostrarAnimales(){

        int i;

    System.out.printf("|--------------------------------------------------------------------------------------------|\n");
    System.out.printf("| ANIMALES DEL REFUGIO                                                                       |\n");
    System.out.printf("|--------------------------------------------------------------------------------------------|\n");            
    System.out.printf("| Nombre  | Especie | Cuidador        | Formación | Peso  (kg)  | Consumo (kg)  | Coste EUR  |\n");       
    System.out.printf("|--------------------------------------------------------------------------------------------|\n");            



    for(i=0;i<this.c;i++){
    
        System.out.printf("| %8s | %8s | %s %8s | %s | %8.2f | %8.2f | %8.2f |\n", animales[i].getNombre(), animales[i].getEspecie(), animales[i].getNombreC(), animales[i], animales[i].getFormacion(),animales[i].getPeso(),animales[i].getConsumo(),calcularCosteDiario(i));

    

    }


    System.out.printf("| Coste diario total de alimentación: %.2f EUR|\n", calcularCosteDiarioTotal());            
    System.out.printf("| Peso medio de los animales: %.2f kg         |\n",calcularPesoMedio());            

    
    
    }



}
