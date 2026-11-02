package Vista;
import java.util.Scanner;


public class Vista {

    Scanner sc=new Scanner(System.in);

    public void showMenu(){

        System.out.printf("1.-Leer tabla de ventas\n2.-Leer tabla de precios\n3.-Calcular ingresos totales\n4.-Mostrar resultados\nq.-Salir");
    }

    public String getUserOption(){
        return sc.nextLine();
    }

    public void showMessage(String m){
        System.out.printf("%s",m);
    }

    public double getNumber(String m){

        System.out.printf("%s",m);
        return sc.nextDouble();
        
    }


}
