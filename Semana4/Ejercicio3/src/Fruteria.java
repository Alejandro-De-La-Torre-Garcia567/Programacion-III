import java.io.Console;

class Fruta{

    private float precio, cantidad;
    private String nombre;
    final float IVA=(float)1.04;
    private float precioIVA;
    private float precioTotal;



    public Fruta(String nombre, float precio){

        if(precio<0){

            System.out.printf("Precio erróneo");
            System.exit(1);
        }


        this.precio=precio;
        this.nombre=nombre;
        this.cantidad=0;
        this.precioIVA=0;
        this.precioTotal=0;

    }

    public float getIVA(){

        return this.precioIVA;
    }


    public float getTotal(){

        return this.precioTotal;
    }

    public float calcularIVA(){

        precioIVA=(this.precio*IVA);

        return precioIVA;
    }


    public float precioTotal(){

        if(precioIVA==0){

            System.out.printf("El precio con IVA no ha sido calculado o asignado");
            return 0;
        }

        precioTotal=precioIVA*cantidad;

        return precioTotal;
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

        String n1=(c.readLine("Introduzca el nombre de la segunda fruta: "));

        try{

        p2=Float.parseFloat(c.readLine("Introduzca el precio por kilo: "));
        

            }catch (Exception e){

                System.out.printf("Tipo de valor incorrecto");
                return;

            }


        Fruta frutas[] =new Fruta[2];

        frutas[0]=new Fruta(n,p1);
        frutas[1]=new Fruta(n1,p2);


        boolean s=false;
            int i;
            int cliente=1;
            String inputKilos;
            float cantidad;
            
        while(s!=true){



            for(i=0;i<frutas.length;i++){

            inputKilos=c.readLine("Introduzca la cantidad de kilos a comprar de %s: ", frutas[i].getNombre());

            try {
                
                cantidad=Float.parseFloat(inputKilos);

            }catch (Exception e){

                System.out.printf("Tipo de valor incorrecto");
                i--;
                continue;
            }

            if(cantidad<0){

                System.out.printf("Los kilos no pueden ser negativos");
                i--;
                continue;

            }

                frutas[i].setCantidad(cantidad);
                frutas[i].calcularIVA();
                frutas[i].precioTotal();

            }

 System.out.printf("\n\n|------------------------------------------------------------------|\n");
 System.out.printf("| Cliente                                                     | %2d |\n",cliente);
 System.out.printf("|------------------------------------------------------------------|\n");
 System.out.printf("| %-10s | %6.2f kg | precio Kg con IVA %8.2f | %8.2f € |\n", frutas[0].getNombre(),frutas[0].getCantidad(), frutas[0].getIVA(),frutas[0].getTotal());
 System.out.printf("| %-10s | %6.2f kg | precio Kg con IVA %8.2f | %8.2f € |\n",frutas[1].getNombre(),frutas[1].getCantidad(), frutas[1].getIVA(),frutas[1].getTotal());
 System.out.printf("|------------------------------------------------------------------|\n");
 System.out.printf("| Total con IVA %8.2f €                                         |\n",frutas[0].getTotal()+frutas[1].getTotal());
 System.out.printf("|------------------------------------------------------------------|\n\n\n");

            String respuesta= c.readLine ("¿Desea incluir otro cliente?(s/n)");
            
            
            if(respuesta.equalsIgnoreCase("s")){

                cliente++;
            }else
                s=true;

        }


    }


}