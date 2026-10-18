package utilidades;

public class Refugio {


    private Animal [] animales;
    private float precio;
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

        if(animales.length==0){

            System.out.printf("Error: no hay animales registrados en el refugio");
            return 0;
        }

        for(i=0;i<animales.length;i++){

            peso+=animales[i].getPeso();

        }

        return peso/animales.length;
    }


    public float calcularCosteDiario(){

        
        return (animales[i].getConsumo) * (animales[i].getPrecio);
        
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




}
