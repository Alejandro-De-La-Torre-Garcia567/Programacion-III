import java.util.Scanner;
import coche.Coche;
import java.util.ArrayList;



public class App{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        
        int o;

        do{

        System.out.printf("MENÚ\n\n");
        System.out.printf("1: Agregar un nuevo coche al sistema\n");
        System.out.printf("2: Listar todos los coches en el sistema\n");
        System.out.printf("3: Buscar un coche específico en el sistema\n");
        System.out.printf("4: Actualizar la información de un coche específico\n");
        System.out.printf("5: Eliminar un coche específico del sistema\n");


        System.out.printf("\nElija una opción: ");
        o=sc.nextInt();




        


        }while(o!=5);


    }

}