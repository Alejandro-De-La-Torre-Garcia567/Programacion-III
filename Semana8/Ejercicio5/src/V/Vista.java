package V;
import java.util.Scanner;

public class Vista {

    Scanner sc=new Scanner(System.in);

    public void showMessage(String prompt){

        System.out.println(prompt);
    }


    public void showMenu(){

        System.out.println("MENU");
        System.out.println("1.Volver a crear la lista de alumnos");
        System.out.println("2.Mostrar tabla de alumnos");
        System.out.println("3.Exportar datos personales (CSV)");
        System.out.println("4.Exportar direcciones (CSV)");
        System.out.println("q.Salir");

    }


    public String getUserOption(){

        System.out.printf("Introduzca una opción: ");
        return sc.nextLine();
        
    }



    public void wrongOption(){

        System.out.println("Opción incorrecta vuelva a intentarlo");

    }
}
