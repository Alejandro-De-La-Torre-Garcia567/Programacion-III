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
