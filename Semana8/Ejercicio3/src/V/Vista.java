package V;
import java.util.Scanner;


public class Vista {

    Scanner sc= new Scanner(System.in);

    public void showMenu(){

        System.out.printf("\tMENÚ\n");
        System.out.printf("\t1.Valor mínimo de factura\n");
        System.out.printf("\t2.Listado total de facturas\n");
        System.out.printf("\t3.Exportar a archivo .html\n");
        System.out.printf("\t4.Exportar a archivo .csv\n");
        System.out.printf("\t5.Salir del programa\n");
    }



    public int getUserOption(){

        System.out.printf("Introduzca una opción: ");
        return sc.nextInt();
    }

    public void wrongOption(){

        System.out.println("Opción incorrecta no vuelva a intentarlo");

    }

    public float getUserImport(){

        try{

            return sc.nextFloat();
            
        }catch(Exception e){

            System.out.printf("Tipo de dato incorrecto");
            return 0;
        }
        
    }


    public void exit(){

        System.out.println("Ha salido del programa");
    }



    public void mostrarListadeClientes(String tabla){

        System.out.println(tabla);


    }
}
