package V;
import java.util.Scanner;

public class Vista {

    Scanner sc=new Scanner(System.in);


    public void showMessage(String prompt){

        System.out.println(prompt);
    }


    public void showMenu(){


        System.out.printf("\tMENÚ\n\n");
        System.out.printf("\t1. Leer fichero TSV del escritorio\n");
        System.out.printf("\t2. Mostrar datos en forma tabular\n");
        System.out.printf("\t3. Salir del programa\n");

    }

    public void exit(){


        System.out.println("Ha salido del programa");
    }

    public void wrongOption(){


        System.out.println("Opción incorrecta vuelva a intetarlo");

    }

    public int getUserOption(){

        try{
         return sc.nextInt();
            
        }catch(Exception e){

            System.out.println("Tipo de dato incorrecto, volviendo al menu");
            return -1;
        }
    }

}
