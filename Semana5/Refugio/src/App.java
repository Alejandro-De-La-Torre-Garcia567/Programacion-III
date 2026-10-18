import utilidades.*;
import java.io.Console;


public class App{

    public static void main(String [] args){

        Console c=System.console();

        if (c==null){

            System.out.printf("Error: No hay una consola disponible");
            return;

        }


        int opcion;

        Refugio miRefugio =new Refugio();

        do{


            System.out.printf("|---------------------------------------------------|\n");
            System.out.printf("| GESTIÓN DEL REFUGIO                               |\n");
            System.out.printf("|---------------------------------------------------|\n");
            System.out.printf("| 1) Crear un nuevo registro de animales            |\n");
            System.out.printf("| 2) Configurar el precio del alimento por kg       |\n");
            System.out.printf("| 3) Añadir un nuevo animal al refugio              |\n");
            System.out.printf("| 4) Mostrar información de los animales            |\n");
            System.out.printf("| 5) Salir (se borrará toda la información)         |\n");
            System.out.printf("|---------------------------------------------------|\n");
            
            
            
            
            
            opcion=Integer.parseInt(c.readLine("\nSeleccione una opción (1-5): "));


            if(opcion==1){

            miRefugio.setArray(Integer.parseInt(c.readLine("Introduzca un tamaño para el nuevo registro de animales: ")));


            }else if(opcion==2){




            }else if(opcion==3){




            }else if (opcion==4){




            }else if(opcion==5){




            }else{


                System.out.printf("Error: opcion incorrecta, vuelva a intentarlo\n\n\n");

            }



        }while (opcion!=5);



    }

}