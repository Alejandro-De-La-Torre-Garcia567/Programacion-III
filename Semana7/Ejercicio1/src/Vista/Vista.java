package Vista;
import java.util.Scanner;

public class Vista {

    Scanner sc= new Scanner(System.in);

    public void showMenu(){

        System.out.printf("1.-Leer los números\n2.-Calcular la suma\n3.-Mostrar el resultado\n4.-Salir\n");

    }


    public int getNumberInput(String prompt){
        System.out.printf("%s",prompt);
        return sc.nextInt();
    }


    public void showResult(int r,String resultado){

        System.out.printf("%s",resultado);
        System.out.printf("%d",r);

    }


    public int getOption(){
        return sc.nextInt();
    }

    public void showMessage(String m){
        System.out.printf("%s",m);
    }

}
