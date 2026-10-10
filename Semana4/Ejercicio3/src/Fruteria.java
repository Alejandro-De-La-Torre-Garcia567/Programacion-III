import java.io.Console;

class Fruta{

    float precio, cantidad;
    String nombre;
    final float IVA=1.04;


    public Fruta(String nombre, float precio){

        this.precio=precio;
        this.nombre=nombre;

    }


    public float pIVA(){

        float pIVa=precio*IVA;
        return pIva;

    }



}








public class Fruteria{

    public static void main(String args[]){

        Console c= System.console();

        if (c==NULL){

            System.out.printf("No hay una consola disponible");
            return;
        }



        
        String n=(c.readLine("Introduzca el nombre de la primera fruta: "));
        float p1=Float.parseFloat(c.readLine("Inntroduzca el precio por kilo de las peras: "));

        Fruta p=new Fruta(n,p1);

        n=(c.readLine("Introduzca el nombre de la segunda fruta: "));
        float p2=Float.parseFloat(c.readLine("Inntroduzca el precio por kilo de las manzanas: "));

        Fruta m=new Fruta(n,p2);




    }


}