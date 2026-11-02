package Vista;
import java.util.Scanner;


public class Vista {

    Scanner sc=new Scanner(System.in);

    public void showMenu(){

        System.out.printf("1.-Leer tabla de ventas\n2.-Leer tabla de precios\n3.-Calcular ingresos totales\n4.-Mostrar resultados\nq.-Salir");
    }

    public String getUserOption(){
        System.out.printf("\n\nIntroduzca una opción: ");
        return sc.nextLine();
    }

    public void showMessage(String m){
        System.out.printf("%s",m);
    }

    public double getUserData(){

        return sc.nextDouble();
        
    }

    public int getAlmacenUnidades(){

        return sc.nextInt();
    }

    public void getAlmacenUnidadesText(String m, int i){

        System.out.printf(m,i+1);
    }




}
