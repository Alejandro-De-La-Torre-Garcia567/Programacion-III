package utilidades;

public class Refugio {


    private Animal [] animales;
    private float precio;
    private int cantidad;


    public Refugio(){

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




}
