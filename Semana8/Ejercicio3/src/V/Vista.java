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
    }



    public String getUserOption(){

        System.out.printf("Introduzca una opción: ");
        return sc.nextLine();
    }





}
