package V;
import java.util.Scanner;

public class Vista {

    Scanner sc=new Scanner(System.in);


    public void showMessage(String prompt){

        System.out.println(prompt);
    }


    public void showMenu(){


        System.out.printf("\n\n\tMENÚ\n\n");
        System.out.printf("1. Leer fichero TSV del escritorio\n");
        System.out.printf("2. Mostrar datos en forma tabular\n");
        System.out.printf("3. Salir del programa\n");

    }

    public void exit(){


        System.out.println("Ha salido del programa");
    }

    public void wrongOption(){


        System.out.println("Opción incorrecta vuelva a intetarlo");

    }

    public int getUserOption(){

        try{

        System.out.printf("Elija una opción: ");

        int i=sc.nextInt();
        sc.nextLine();
        return i;
            
        }catch(Exception e){

            System.out.println("Tipo de dato incorrecto, volviendo al menu");
            sc.nextLine();
            return -1;
        }
    }



    public String getUserPath(){


        System.out.printf("Introduzca el nombre del archivo a cargar desde su escritorio: ");
        return sc.nextLine();
    }

}
