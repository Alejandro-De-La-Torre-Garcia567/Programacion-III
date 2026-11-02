package Vista;
import java.util.Scanner;

public class Vista {

    Scanner sc= new Scanner(System.in);

    public void showMenu(){

        System.out.printf("1.-Leer los números\n2.-Calcular la suma\n3.-Mostrar el resultado\n4.-Salir\n");

    }


    public int getNumberInput(){

        return sc.nextInt();
    }


    


}
