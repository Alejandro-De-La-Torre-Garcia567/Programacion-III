import java.io.Console;

class Fruta{

    private float precio, cantidad;
    private String nombre;
    final float IVA=(float)1.04;


    public Fruta(String nombre, float precio){

        if(precio<0){

            System.out.printf("Precio erróneo");
            System.exit(1);
        }


        this.precio=precio;
        this.nombre=nombre;
        this.cantidad=0;

    }

   public String getNombre(){

    return this.nombre;
   }

   public float getPrecio(){

    return this.precio;
   }


   public void setCantidad(float cantidad){

    this.cantidad=cantidad;
   }


   public float getCantidad (){

    return this.cantidad;
   }

}








public class Fruteria{

    public static void main(String args[]){

        Console c= System.console();

        if (c==null){

            System.out.printf("No hay una consola disponible");
            return;
        }



        float p2,p1;
        String n=(c.readLine("Introduzca el nombre de la primera fruta: "));

        try{
        p1=Float.parseFloat(c.readLine("Introduzca el precio por kilo: "));

            }catch(Exception e){

                System.out.printf("Tipo de valor incorreto");
                return;
          
            }

        n=(c.readLine("Introduzca el nombre de la segunda fruta: "));

        try{

        p2=Float.parseFloat(c.readLine("Introduzca el precio por kilo: "));
        

            }catch (Exception e){

                System.out.printf("Tipo de valor incorrecto");
                return;

            }


        Fruta frutas[] =new Fruta[2];

        frutas[0]=new Fruta(n,p1);
        frutas[1]=new Fruta(n,p2);









    }


}